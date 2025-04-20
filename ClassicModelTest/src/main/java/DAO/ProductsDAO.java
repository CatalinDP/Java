/*

 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsDAO implements BaseDAO{

    @Override
    public String toString() {
        return "ProductsDAO{" + "productCode=" + productCode + ", productName=" + productName + ", productLine=" + productLine + ", productScale=" + productScale + ", productVendor=" + productVendor + ", productDescription=" + productDescription + ", quantityInStock=" + quantityInStock + ", buyPrice=" + buyPrice + ", MSRP=" + MSRP + '}';
    }
    private String productCode;
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private int quantityInStock;
    private double buyPrice;
    private double MSRP;
    List<ProductsDAO> products = new ArrayList();

    public ProductsDAO() {
    }

    public ProductsDAO(String productCode) {
        this.productCode = productCode;
    }

    public ProductsDAO(String productName, String productLine, String productScale, String productVendor, String productDescription, int quantityInStock, double buyPrice, double MSRP) {
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.MSRP = MSRP;
    }

    public ProductsDAO(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, int quantityInStock, double buyPrice, double MSRP) {
        this(productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP);
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getMSRP() {
        return MSRP;
    }

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }
    
    @Override
    public List listar() {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM products";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductsDAO product = new ProductsDAO();
                product.setProductCode(rs.getString("productCode"));
                product.setProductName(rs.getString("productName"));
                product.setProductLine(rs.getString("productLine"));
                product.setProductScale(rs.getString("productScale"));
                product.setProductVendor(rs.getString("productVendor"));
                product.setProductDescription(rs.getString("productDescription"));
                product.setQuantityInStock(rs.getInt("quantityInStock"));
                product.setBuyPrice(rs.getDouble("buyPrice"));
                product.setMSRP(rs.getDouble("MSRP"));
                this.products.add(product);
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return products;
    }

    @Override
    public boolean eliminar(Object obj) {
        ProductsDAO product = (ProductsDAO) obj;
        Scanner sc = new Scanner(System.in);
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "DELETE FROM products WHERE productCode = ?";
        try {
            ps = con.prepareStatement(sql);
            System.out.println("Estas seguro de que quieres elimiar el producto: 1-Si o 2-No " + product.buscar(product));
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> ps.executeQuery();
                case 2 -> System.out.println("No se elimina");
                default -> System.out.println("Introduce un numero correcto");
            }
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error eliminando: " + e);
        } finally {
            sc.close();
        }
        return succes;
    }

    @Override
    public boolean añadir(Object obj) {
        ProductsDAO product = (ProductsDAO) obj;
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "INSERT INTO payments (productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(0, product.getProductCode());
            ps.setString(1, product.getProductName());
            ps.setString(2 , product.getProductLine());
            ps.setString(3 , product.getProductScale());
            ps.setString(4, product.getProductVendor());
            ps.setString(5, product.getProductDescription());
            ps.setInt(6, product.getQuantityInStock());
            ps.setDouble(7, product.getBuyPrice());
            ps.setDouble(8, product.getMSRP());
            ps.execute();
            this.products.add(product);
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return succes;
    }

    @Override
    public boolean modificar(Object obj) {
        ProductsDAO product = (ProductsDAO) obj;
        String sql = "UPDATE payments SET productName = ? , productLine = ?, productScale = ?, productVendor = ?, productDescription = ?, quantityInStock = ?, buyPrice = ?, MSRP = ? WHERE productCode = ?";
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(0, product.getProductName());
            ps.setString(1, product.getProductLine());
            ps.setString(2, product.getProductScale());
            ps.setString(3, product.getProductVendor());
            ps.setString(4, product.getProductDescription());
            ps.setInt(5, product.getQuantityInStock());
            ps.setDouble(6, product.getBuyPrice());
            ps.setDouble(7, product.getMSRP());
            ps.setString(8, product.getProductCode());
            ps.execute();
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return succes;
    }

    @Override
    public boolean buscar(Object obj) {
        boolean succes = false;
        PreparedStatement ps;
        ProductsDAO product = new ProductsDAO();
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM orders WHERE orderNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(0, product.getProductCode());
            rs = ps.executeQuery();
            while (rs.next()) {
                product.setProductCode(rs.getString("productCode"));
                product.setProductName(rs.getString("productName"));
                product.setProductLine(rs.getString("productLine"));
                product.setProductScale(rs.getString("productScale"));
                product.setProductVendor(rs.getString("productVendor"));
                product.setProductVendor(rs.getString("productDescription"));
                product.setQuantityInStock(rs.getInt("quantityInStock"));
                product.setBuyPrice(rs.getDouble("buyPrice"));
                product.setMSRP(rs.getDouble("MSRP"));
                succes = true;
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar el pedido: " + e);
        }
        System.out.println(product);
        return succes;
    }
}
