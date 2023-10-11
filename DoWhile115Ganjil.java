/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile115ganjil;

public class DoWhile115Ganjil {
    public static void main(String[] args) {
       System.out.println("Buatlah bilangan ganjil di rentang 0-15");
          System.out.print("Hasil bilangan ganjil: ");
          
        int i = 0;
        do {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 15);
    }
}

    
    

