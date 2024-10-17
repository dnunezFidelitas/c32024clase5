/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32024clase5;

/**
 *
 * @author viti
 */
public class C32024Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Trabajador esclavo1 = new Trabajador();
        Trabajador esclavo2 = new Trabajador();
        Trabajador juanitoElCapatas = new Trabajador();

        esclavo1.edad = 20;
        esclavo1.sexo = "M";
        esclavo2.edad = 18;
        esclavo2.sexo = "F";
        juanitoElCapatas.edad = 50;
        esclavo1.edad2 =10;
        juanitoElCapatas.sexo = "F";

        System.out.println("esclavo1.edad =" + esclavo1.edad);
        System.out.println("esclavo2.edad =" + esclavo2.edad);
        System.out.println("juanitoElCapatas.edad =" + juanitoElCapatas.edad);
        
        System.out.println("esclavo1.edad2 =" + esclavo1.edad2.doubleValue());
        
        esclavo1.imprimaDatosPersonales();
        esclavo2.imprimaDatosPersonales();
        juanitoElCapatas.imprimaDatosPersonales();
        juanitoElCapatas.metodoQueDevuelveEmpresa();

    }

}
