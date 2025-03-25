
package MáquinaDeSnacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;
    
    //Bloque de tipo static inicializador
    
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Patatas", 1.20));
        snacks.add(new Snack("Cola", 0.80));
        snacks.add(new Snack("Bocata", 2.20));
    }
    
    static public void agregarSnack(String nombre, double precio) {        
        snacks.add(new Snack(nombre, precio));
    }
    
    static public void mostrarSnacks() {
        var inventarioSnacks = "";
        for (var snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }
    public static void main(String[] args) {
        Snack saksdask = new Snack("Pasfdas", 12);
        System.out.println(saksdask.toString());
    }
}
