/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password;

import java.util.Random;


public class Password {
    private int passLenght;
    private String password;
    private final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Password() {
        this.passLenght = 8;
        generatePassword();
    }
    public Password(int passLenght) {
        this.passLenght = passLenght;  
        generatePassword();
    }
    
    public void generatePassword() {
        String pass = "";
        Random ran = new Random();
        for(int i = 0; i < this.passLenght; i++) {
            if (i > this.passLenght - (ran.nextInt(3, this.passLenght - 5)) ) {
                pass += ran.nextInt(0, 9);
            } else  {
                char c = this.letters.charAt(ran.nextInt(0, letters.length()));   
                pass += c;
            }
        }
        this.password = pass;
    }
    
    public boolean esFuerte() {
        int mayus = 0, minus = 0, nums = 0;
        boolean esFuerte = false;
        for (int i = 0; i < this.password.length(); i++) {
            boolean encontrado = false;
            char c = password.charAt(i);
            while(!encontrado) {
                for (int j = 26; j < this.letters.length(); j++) {
                    if (c == this.letters.charAt(j)) {
                        mayus++;
                        encontrado = true;
                    }
                }
                for (int j = 0; j < this.letters.length() - 26; j++) {
                    if (c == this.letters.charAt(j)) {
                        minus++;
                        encontrado = true;
                    }
                }
                while(!encontrado) {
                    if (c >= '0' && c <= '9') {
                        encontrado = true;
                        nums++;
                    }
                }
            }
        }
         if (mayus > 2 && minus > 1 && nums > 5) {
                esFuerte = true;
            } else {
                esFuerte = false;
            }
         System.out.println("Mayus: " + mayus);
         System.out.println("Minus: " + minus);
         System.out.println("Nums: " + nums);
        return esFuerte;
    }

    public int getPassLenght() {
        return passLenght;
    }

    public void setPassLenght(int passLenght) {
        this.passLenght = passLenght;
    }

    public String getPassword() {
        return password;
    }
}
