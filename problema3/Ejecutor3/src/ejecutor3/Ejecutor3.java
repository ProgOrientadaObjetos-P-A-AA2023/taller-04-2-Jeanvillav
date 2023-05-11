/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor3;

/**
 *
 * @author villa
 */
public class Ejecutor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Fabricante f1 = new Fabricante();
        Auto auto1 = new Auto();
        auto1.establecerFabricante(f1);
        auto1.calcularVMatricula();
        System.out.printf("%s\n", auto1);

        Fabricante f2 = new Fabricante("Ford", "Belgica");
        Auto a2 = new Auto("110123123", f1, 2018, 34000);
        a2.establecerFabricante(f2);
        a2.calcularVMatricula();
        System.out.printf("%s\n", a2);

    }
    
}
