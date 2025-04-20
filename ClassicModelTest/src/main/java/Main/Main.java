package Main;

import DAO.BaseDAO;
import DAO.CustomersDAO;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaseDAO obj = null;
        obj = new CustomersDAO(777, "Catalin Constr", "Manolo", "Lama", "+346518864", "Casita casota", "", "madri", "madri", "espanita", "30000", 1612, 1000.00);
        
        //System.out.println(obj.añadir(obj));
        CustomersDAO nuevo = new CustomersDAO(777, "Catalin", "Manuel", "Lama", "+36122646", "asdsad", "", "Barselo", "catala", "espain", "28100", 1612, 100000.00);
        System.out.println(obj.modificar(nuevo));
        System.out.println(obj.buscar(obj));
        System.out.println(obj.eliminar(obj));
    }
}
