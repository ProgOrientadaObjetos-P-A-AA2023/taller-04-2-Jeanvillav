/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor1;

/**
 *
 * @author villa
 */
public class Ejecutor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    Estudiantes1 estudiante1 = new Estudiantes1();      
     Universidad universidad = new Universidad(); 
     
               estudiante1.establecerUniversidad(universidad);
        estudiante1.calcularPromedio();
        System.out.printf("%s\n", estudiante1);

        Universidad universidad2 = new Universidad("UNL", "Loja");
        Estudiantes1 estudiante2 = new Estudiantes1("Lionel Messi", 7, 6.5, 10, universidad2);
        estudiante2.calcularPromedio();
        System.out.printf("%s", estudiante2);
        
    
          
    }
    
}
