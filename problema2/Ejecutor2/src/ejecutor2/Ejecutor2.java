/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor2;

/**
 *
 * @author villa
 */
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Provincias1 provincia1 = new Provincias1();
        Profesores1 profesor1 = new Profesores1();
        profesor1.establecerProvincia(provincia1);
        profesor1.calcaularSueldoT();
        System.out.printf("%s\n", profesor1);

        Provincias1 provincia2 = new Provincias1("Loja", 45000);
        Profesores1 profesor2 = new Profesores1("Jean", "Casado", 45000, 
                "1107612653", provincia2);
        profesor2.calcaularSueldoT();
        System.out.printf("%s", profesor2);

    }
    
}
