/*

 */
package DAO;

import java.util.List;

public interface BaseDAO {
    public List listar();
    public boolean eliminar(Object obj);
    public boolean añadir(Object obj);
    public boolean modificar(Object obj);
    public boolean buscar(Object obj);
}
