/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jeffersonventura
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String documento;

    public Persona(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    
    public void datosPersona (String nombre, String apellido, String documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        
    }
    
    public void getDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + documento);
    }
}
