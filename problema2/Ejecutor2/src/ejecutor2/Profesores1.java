/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor2;

/**
 *
 * @author villa
 */
public class Profesores1 {
        private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private Provincias1 provincia;

    public Profesores1() {
        nombre = "Moises";
        apellido = "Caicedo";
        cedula = "1105747016";
        sueldoBasico = 120.4;
    }

    public Profesores1(String n, String a, double sB, String c, Provincias1 p) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = sB;
        provincia = p;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establcerSueldoB(double c) {
        sueldoBasico = c;
    }

    public void calcaularSueldoT() {
        sueldoTotal = sueldoBasico * 1.2;
    }

    public void establecerProvincia(Provincias1 p) {
        provincia = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoB() {
        return sueldoBasico;
    }

    public double obtenerSueldoT() {
        return sueldoTotal;
    }

    public Provincias1 obtenerProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Nombre: %s
                                       Apellido: %s
                                       Sueldo Básico: %.2f
                                       Sueldo Total: %.2f
                                       Cédula: %s
                                       Provincia: %s
                                       Número de Habitantes: %d
                                       """,
                nombre,
                apellido,
                sueldoBasico,
                sueldoTotal,
                cedula,
                obtenerProvincia().obtenerNombre(),
                obtenerProvincia().obtenerNHabitantes());
        return mensaje;
    }
}
