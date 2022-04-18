/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author NEXO-MAX
 */
public class Hombre {
    String nombre;

    Hombre(String nombre) {
        this.nombre = nombre;
    }

        
    
     public void jugarConRobot(Robot robot){
        
        robot.presentacion();
        robot.recargar();
        robot.avanzar(500);
        robot.recargar();
        robot.retroceder(10);
        robot.abrirAlas();
        robot.frase1();
        robot.volar(10);
        robot.cerrarAlas();
        robot.frase2();
        
        Scanner S = new Scanner(System.in);
        
         System.out.println("Pasos para avanzar");
         int p = S.nextInt();
         
         robot.avanzar(p);
         System.out.println("Caminó " + p + " pasos");
         
         System.out.println("Ingrese los pasos a retroceder");
         int pr = S.nextInt();
         
         robot.retroceder(pr);
         System.out.println("Retroceder " + pr + " pasos");
         
         System.out.println("El robot movio el bote");
             }
}
    

