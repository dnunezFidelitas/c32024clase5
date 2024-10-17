/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosa;

/**
 *
 * @author compr
 */
public class Carro {
    
    public String color;
    public int suspension;
    public String ventanas;
    public int asiento;
    
    
    
    public void ruedascarro(int experiencia){
        if (experiencia >=5){
            System.out.println("su experiencia es mayor a 5 años puede manejar vehiculo de 6 ruedas");
            if(experiencia <5){
                System.out.println("su experiencia solo le permite utilizar carro basico");
            }
        }
    }
    
    
}



