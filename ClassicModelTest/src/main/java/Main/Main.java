package Main;

import DAO.BaseDAO;
import DAO.CustomersDAO;
import DAO.EmployeesDAO;
import DAO.OrdersDAO;
import DAO.PaymentsDAO;
import DAO.ProductsDAO;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaseDAO obj = null;
//        obj = new CustomersDAO(777, "Catalin Constr", "Manolo", "Lama", "+346518864", "Casita casota", "", "madri", "madri", "espanita", "30000", 1612, 1000.00);
//        
//        System.out.println(obj.añadir(obj));
//        CustomersDAO nuevoCustomer = new CustomersDAO(777, "Catalin", "Manuel", "Lama", "+36122646", "asdsad", "", "Barselo", "catala", "espain", "28100", 1612, 100000.00);
//        System.out.println(obj.modificar(nuevoCustomer));
//        System.out.println(obj.buscar(obj));
//        System.out.println(obj.eliminar(obj));
        
//        obj = new EmployeesDAO(666, "Lomas", "Turbo", "x9040", "TurboLomas@gmail.com", "EL goat", 1, 1002);
        
//        System.out.println(obj.añadir(obj));
//        System.out.println("Añadir -------------------------");
//        EmployeesDAO nuevoEmployee = new EmployeesDAO();
//        System.out.println(obj.modificar(nuevoEmployee));
//        System.out.println("Mod -------------------------");
//        System.out.println(obj.buscar(obj));
//        System.out.println("Busc -------------------------");
//        System.out.println(obj.eliminar(obj));
//        System.out.println("Eli -------------------------");

//        obj = new PaymentsDAO(777, "HQ77777", "2025-10-26", 77777.77);
//        System.out.println(obj.añadir(obj));
//        System.out.println("Añadir -------------------------");
//        System.out.println(obj.buscar(obj));
//        System.out.println("Busc -------------------------");
//        PaymentsDAO nuevoEmployee = new PaymentsDAO(777, "HQ77777", "2025-10-26", 90000.77);
//        System.out.println(obj.modificar(nuevoEmployee));
//        System.out.println("Mod -------------------------");
//        System.out.println(obj.buscar(obj));
//        System.out.println("Busc -------------------------");
//        System.out.println(obj.eliminar(obj));
//        System.out.println("Eli -------------------------");

        obj = new OrdersDAO(77777, "2025-10-26", "2025-10-29", "2025-10-27", "Shipped", "El mah mejoh", 777);
//        System.out.println(obj.añadir(obj));
//        System.out.println("Añadir -------------------------");
//        System.out.println(obj.buscar(obj));
//        System.out.println("Busc -------------------------");
//        OrdersDAO nuevoOrder = new OrdersDAO(77777, "2025-10-26", "2025-10-29", "2025-10-27", "Shipped", "El mah mejoh x2", 777);
//        System.out.println(obj.modificar(nuevoOrder));
//        System.out.println("Mod -------------------------");
//        System.out.println(obj.buscar(obj));
//        System.out.println("Busc -------------------------");
//        System.out.println(obj.eliminar(obj));
//        System.out.println("Eli -------------------------");

        obj = new ProductsDAO("S11_7777", "Terraneitor 3000", "Trucks and Buses", "1:10", "Catalin Constr", "ES EL TERRANEITOR 3000 CON TRACCIÓN", 7777, 80.00, 400.00);
        System.out.println(obj.añadir(obj));
        System.out.println("Añadir -------------------------");
        System.out.println(obj.buscar(obj));
        System.out.println("Busc -------------------------");
//        ProductsDAO nuevoOrder = new ProductsDAO("S11_7777", "Terraneitor 4000", "Trucks and Buses", "1:10", "Catalin Constr", "ES EL TERRANEITOR 4000 CON TRACCIÓN", 7777, 80.00, 400.00);
//        System.out.println(obj.modificar(nuevoOrder));
//        System.out.println("Mod -------------------------");
        System.out.println(obj.buscar(obj));
        System.out.println("Busc -------------------------");
//        System.out.println(obj.eliminar(obj));
//        System.out.println("Eli -------------------------");
    }
}
