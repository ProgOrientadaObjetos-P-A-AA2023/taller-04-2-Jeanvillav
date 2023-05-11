/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor1;

/**
 *
 * @author villa
 */
public class Estudiantes1 {
    // calificación de materia 1, calificación de materia 2, calificación de materia 3, 
    // promedio de calificaciones y universidad (este atributo se considera como un objeto de tipo Universidad, 
    // que tiene atributos como: nombre de universidad y dirección)
    private String nombre;
    private double materia1,materia2,materia3,promedio;
    private Universidad universidad;
    
    public Estudiantes1(){
        nombre = "Cristiano Ronaldo";
        materia1 = 9.50;
        materia2 = 10.00;
        materia3 = 8.9;
        promedio = 9.00;
        
    }
    
    public Estudiantes1(String n, double m1, double m2, double m3, Universidad u){
        nombre = n;
        materia1 = m1;
        materia2 = m2;
        materia3 = m3;
        universidad = u;

    }
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerMateria1(double n){
        materia1 = n;
    }
    
    public void establecerMateria2(double n){
        materia2 = n;
    }
     public void establecerMateria3(double n){
        materia3 = n;
    }
      public void calcularPromedio(){
        promedio = (materia1 + materia2 + materia3) / 3;
    }
      public void establecerUniversidad(Universidad u) {
        universidad = u;
    }
      
    public String obtenerNombre(){
        return nombre;
    }
    
    public double obtenerMateria1(){
        return materia1;
    }
    
     public double obtenerMateria2(){
        return materia2;
    }
      public double obtenerMateria3(){
        return materia3;
    }
       public double obtenerPromedio(){
        return promedio;
    }
public Universidad obtenerUniversidad() {
        return universidad;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Nombre: %s
                                       Nota 1: %.2f
                                       Nota 2: %.2f
                                       Nota 3: %.2f
                                        Promedio: %.2f
                                       Universidad: %s
                                       Direccion: %s
                                       """,
                nombre,
                materia1,
                materia2,
                materia3,
                promedio,
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion());
        return mensaje;
    }
   
    
}
