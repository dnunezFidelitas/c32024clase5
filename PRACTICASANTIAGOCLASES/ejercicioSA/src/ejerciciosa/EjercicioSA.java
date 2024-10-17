/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosa;

/**
 *
 * @author compr
 */
public class EjercicioSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Chofer chofer1 = new Chofer(32, 2);
        Chofer chofer2 = new Chofer();
        Chofer chofer3= new Chofer();
        Chofer chofer4= new Chofer();
        Chofer chofer5= new Chofer();
        
        Carro carro1 =new Carro();
        Carro carro2=new Carro();
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();
        Carro carro5 = new Carro();
        
        
        
        chofer2.edad=22;
        chofer2.experiencia=3;
        chofer3.edad=59;
        chofer3.experiencia=6;
        chofer4.edad=18;
        chofer4.experiencia=5;
        chofer5.edad=17;
        chofer5.experiencia=2;
        
        chofer1.setId(119200575);
        
        chofer1.contratar2();
        chofer2.contratar2();
        chofer3.contratar2();
        chofer4.contratar2();
        chofer5.contratar2();
        
        chofer1.autoManejo();
        chofer2.autoManejo();
        chofer3.autoManejo();
        chofer4.autoManejo();
        chofer5.autoManejo();
        
        carro1.ruedascarro(chofer1.experiencia);
        carro2.ruedascarro(chofer2.experiencia);
        carro3.ruedascarro(chofer3.experiencia);
        carro4.ruedascarro(chofer4.experiencia);
        carro5.ruedascarro(chofer5.experiencia);
        
        //estuve investigando un poco y en algunas partes utilice el constructor y tambien utilice getter a setter pero 
        // solo como prueba para ir provando formas mas simples 
        
        
        
        
        
        
        
        
        
        
    }
    
}
