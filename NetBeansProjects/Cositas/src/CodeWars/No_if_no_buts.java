/*

 */
package CodeWars;

/**
 *
 * @author DPCat
 */
public class No_if_no_buts {
     static int mayor(int a, int b) {
         while (a > b) {
             return a;
         }
         while (a < b) {
             return b;
         }
         return 0;
    }
    public static void main(String[] args) {
        System.out.println("Es mayor: " + mayor(5, 7));
    }
}
