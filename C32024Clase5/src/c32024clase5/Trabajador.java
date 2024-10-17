/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase5;

/**
 *
 * @author viti
 */
public class Trabajador {
    //Atributes
    public String id;
    public String sexo;
    public int edad;
    private double salario;
    public Integer edad2;
    public Empresa empresa;
    
    
    public double calcularSalarioBruto(){
        double resultado =0;
        resultado = this.salario - this.salario * 0.09;
        return resultado;
         
    }
    
    public void imprimaDatosPersonales (){
        System.out.println("El sexo del trabajado es " + sexo );
        
    }
    
    
    private void cambiarSexo (String sexo ){
        this.sexo=sexo;
        
    }
    
    public Empresa metodoQueDevuelveEmpresa (){
        return new Empresa();
    }
    
    /*
    public void errorMetodo(){
        System.out.println("Este metodo da error pq no tengo que devolver nada");
        return boolean;
    }*/
    
}
