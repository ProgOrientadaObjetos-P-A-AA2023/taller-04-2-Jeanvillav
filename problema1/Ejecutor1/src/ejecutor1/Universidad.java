/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor1;

/**
 *
 * @author villa
 */
public class Universidad {
    private String nombreU;
    private String direccion; 

    public Universidad() {
        nombreU = "UTPL";
        direccion = "Loja";
    }

    public Universidad(String n, String d) {
        nombreU = n;
        direccion = d;
    } 

    public void establecerNombre(String n) {
        nombreU = n;
    } 

    public String obtenerNombre() {
        return nombreU;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public String obtenerDireccion() {
        return direccion;
    }
    
}
    

