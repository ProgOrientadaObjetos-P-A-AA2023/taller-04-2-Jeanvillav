/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor4;

/**
 *
 * @author villa
 */
public class Ejecutor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Clientes clientes1 = new Clientes();
        Bancos banco1 = new Bancos();
        EntidadesFinancieras entidad = new EntidadesFinancieras();
        entidad.establecerClientes(clientes1);
        entidad.establecerBancos(banco1);
        entidad.calcularComisiones();
        System.out.printf("%s\n", entidad);

        Clientes cliente2 = new Clientes("Cristiano Ronaldo", "Dos Santos Aveiro", 
                "11057470131");
        Bancos banco2 = new Bancos("Banco Pichincha", 3);
        EntidadesFinancieras entidad2 = new EntidadesFinancieras(cliente2, banco2, 10000);
        entidad2.establecerClientes(cliente2);
        entidad2.establecerBancos(banco2);
        entidad2.calcularComisiones();
        System.out.printf("%s", entidad2);
    
    }
    
}
