/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor2;

/**
 *
 * @author villa
 */
public class Provincias1 {
     private String nombre;
    private int habitantes;

    public Provincias1() {
        nombre = "Esmeraldas";
        habitantes = 8000;
    }

    public Provincias1(String n, int nH) {
        nombre = n;
        habitantes = nH;
    }

    public void establecerNombre(String k) {
        nombre = k;
    }

    public void establecerNHabitantes(int k) {
        habitantes = k;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNHabitantes() {
        return habitantes;
    }

}
