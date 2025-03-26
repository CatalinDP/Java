/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package password;

/**
 *
 * @author DPCat
 */
public class PassMain {
    public static void main(String[] args) {
        boolean fuerte;
        Password pass = new Password(12);
        String contra = pass.getPassword();
        System.out.println(contra);
        fuerte = pass.esFuerte();
        System.out.println("Es fuerte? "  + fuerte );
    }
}
