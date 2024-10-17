/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosa;

/**
 *
 * @author compr
 */
public class Chofer {

    private double salary;
    public int edad;
    public String sexo;
    public double altura;
    public int experiencia;
    private int id;

    public Chofer(int edad) {
        this.edad = edad;
    }

    public Chofer() {
    }

    public Chofer(int edad, int experiencia) {
        this.edad = edad;
        this.experiencia = experiencia;
    }
    
    
    
    

    public boolean contratar() {
        if (this.experiencia > 5) {
            return true;

        }
        return false;

    }

    public void contratar2() {
        if (this.experiencia > 5) {
            System.out.println("usted esta contratado");

        }
        System.out.println("no esta contratado");

    }

    public void autoManejo() {
        if (this.edad >= 40) {
            System.out.println("se le va asignar un vehiculo grande");

            if (this.edad <= 20) {
                System.out.println("se le asigna un vehiculo pequeno");
                
                

            }
        }
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    

}
