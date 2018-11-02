/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9;

import Auto.Automóvil;
import java.util.Scanner;

/**
 *
 * @author escritorio
 */
public class Eva_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ui = new Scanner(System.in);
        Automóvil po = new Automóvil();
        System.out.println("Dame la marca del carro");
        po.setMarca(ui.nextLine());
        System.out.println("Dame la placa del carro plis ");
        po.setPlaca(ui.nextLine());
        System.out.println("Que gasolina usas: ");
        po.setGasolina(ui.nextLine());
        System.out.println("Es automatico o estandar: ");
        po.setAues(ui.nextLine());
        System.out.println("Que motor usas ");
        po.setMotor(ui.nextLine());
        System.out.println("Cual es el precio");
        po.setPrecio(ui.nextDouble());
        System.out.println("Cuanto es tu kilometraje ");
        po.setKilometraje(ui.nextDouble());
        System.out.println("Cuantos cambios tienes ");
        po.setCambios(ui.nextInt());
        System.out.println("De que años es ");
        po.setAño(ui.nextInt());
        System.out.println("Cuantas llantas de respuesto tiene ");
        po.setLlanrepu(ui.nextInt());
        
        System.out.println(" Tus datos del carro son  " +po.getMarca() +"  " +po.getPlaca() +"  " +po.getGasolina() +"  " +po.getAues() +"  " +po.getMotor());
        System.out.println(" Tus datos del carro entero " +po.getPrecio() +"\n" +po.getKilometraje() +"\n" +po.getCambios() +po.getAño() +po.getLlanrepu());
    }
    
}

