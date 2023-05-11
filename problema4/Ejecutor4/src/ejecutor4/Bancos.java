/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor4;

/**
 *
 * @author villa
 */
public class Bancos {
    private String nombre;
    private int nSucursales;

    public Bancos() {
        nombre = "Banco del Austro";
        nSucursales = 4;
    }

    public Bancos(String n, int nS) {
        nombre = n;
        nSucursales = nS;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerNSucursales(int c) {
        nSucursales = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNSucursales() {
        return nSucursales;
    }
}
