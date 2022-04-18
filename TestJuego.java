/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

/**
 *
 * @author Gonzalez Maximiliano 
 */
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r1 = new Robot ("Buzz Lightyear");
        Hombre h1 = new Hombre("hombre1");
        Hombre h2 = new Hombre("hombre2");
        h1.jugarConRobot(r1);
        
        
        h2.jugarConRobot(r1);
    }
    
}
