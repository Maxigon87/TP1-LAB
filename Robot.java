/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

/**
 *
 * @author NEXO-MAX
 */
public class Robot {
    int bateria = 1000;
    boolean despierto = true;
    boolean alasOn = false;
    String robot;

     Robot(String robot ) {
        this.robot = robot;
        
    }

      


    public double getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isDespierto() {
        return despierto;
    }

    public void setDespierto(boolean despierto) {
        this.despierto = despierto;
    }
    
    //caminar 
    public void avanzar(int pasos){
        double inicial;
        inicial = (pasos * 0.1);
        if (bateria >= inicial && despierto && !alasOn){
        bateria = bateria - (int)inicial;
            System.out.println("El robot caminó " + pasos + "pasos.");
    }else{
            System.out.println("El robot no pudo caminar.");
        }
    }
    public void retroceder(int pasos){
        int camino = pasos*10/100;
        if (bateria>= camino && despierto && !alasOn){
            if (despierto){
                bateria -= camino;
                System.out.println("Robot retrocedio"+ pasos + " pasos.");
            } else {
                System.out.println("Robot esta dormido");
            }
        }else {
            System.out.println("Robot sin bateria");
        }
    }
    
    //vuelo
    
    public void abrirAlas(){
        if(bateria >= 1 && despierto && !alasOn){
            alasOn = true;    
            System.out.println("Alas del robot preparadas.");}
        else{
            System.out.println("El robot no pudo sacar sus alas.");
        }
    }
    public void cerrarAlas(){
        if(bateria >= 1 && despierto && alasOn){
            alasOn = false;    
            System.out.println("Alas del robot guardadas.");}
        else{
            System.out.println("El robot no pudo guardar sus alas");
        }
    }
    
    public void volar(int metros){
        double vuelo;
        vuelo = (metros);
        if (bateria >= vuelo && despierto && alasOn){
        bateria = bateria - (int)vuelo;
            System.out.println("El robot voló " + metros + "metros.");
    }
            System.out.println("El robot no pudo volar y piensa que es solo un juguete.");
    }
    
    //frases
    
    public void presentacion(){
        System.out.println("Robot se presento: HOLA!SOY BUZZLIGHTYEAR, GUARDIAN ESPACIAL. UNIDAD PROTECCION UNIVERSO.");
    }
         
    public void frase1(){
        System.out.println(" El robot dijo: ¡¡¡HASTA EL INFINITO Y MAS ALLA!!!");
    }
    public void frase2(){
        System.out.println("El robot dijo: COMANDO ESTELAR? RESPONDE COMANDO ESTELAR!");
    }
    public void dormir(){
        this.despierto = false;
        System.out.println("estoy durmiendo");
    }
    public void despertar(){
        this.despierto = true;
        System.out.println("estoy despierto");
    }
    public void recargar(){
         bateria =+ 1000; 
         System.out.println("Robot se acaba de recargar.");
    }
    public void bateriaLlena(){
        if (this.bateria >=1000){
            System.out.println("El robot tiene la bateria llena");
        } 
    }
    public void bateriaVacia(){
        if(this.bateria <=0){
            System.out.println("El robot tiene la bateria vacia");
        }
       
    }
    public int energiaActual(){
        return bateria;
    }
    
}
