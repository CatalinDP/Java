package Datos;

import dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import zonafit.Conexion.Connect;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Connect.getConnection();
        String sql = "SELECT * FROM cliente ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setMembresia(rs.getInt("membresia"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error listar cliente: " + e);
        } finally {
            try  {
                con.close();
            } catch (SQLException e) {
                System.out.println("No se pudo cerrar: " + e);
            } 
        }
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM cliente WHERE id = ?";
        Connection con = Connect.getConnection();
        boolean exists = false;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId()); //?
            rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setMembresia(rs.getInt("membresia"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                System.out.println(cliente);
                exists = true;
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Error: " + ex);
            }
        }
        return exists;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        boolean succes = false;
        PreparedStatement ps;
        String sql = "INSERT INTO cliente (nombre, apellido, membresia) VALUES(?, ?, ?)";
        Connection con = Connect.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            succes = true;
        } catch (SQLException e) {
            System.out.println("Error al agregar: " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e);
            }
        }
        
        return succes;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        boolean succes = false;
        PreparedStatement ps;
        String sql = "UPDATE cliente SET nombre = ? , apellido = ? , membresia = ? WHERE id = ?";
        Connection con = Connect.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            succes = true;
        } catch (SQLException e) {
            System.out.println("Error al modificar cliente: " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e);
            }
        }
        
        return succes;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        boolean succes = false;
        PreparedStatement ps;
        String sql = "DELETE FROM cliente WHERE id = ?";
        Connection con = Connect.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
            succes = true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e);
            }
        }
        
        return succes;
    }
}
