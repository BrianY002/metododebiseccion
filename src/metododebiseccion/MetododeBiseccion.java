/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metododebiseccion;

/**
 *
 * @author Azul6
 */
public class MetododeBiseccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodo metodo = new Metodo();
        
        
    
    metodo.setFuncion("x^2 - 5");
       
        
        metodo . setFuncion ( " x ^ 2 - 5 " ) ;
double raiz = metodo.biseccion ( 2 , 2.5 , 0.001 ) ;
System.out.println ( " La raiz es : " + raiz ) ;
metodo . setFuncion ( " cos ( x ) -x " ) ;
double raiz2 = metodo.biseccion ( 0 , Math.PI / 2 , 0.001 ) ;
System.out.println ( " La raiz es : " + raiz2 ) ;
        
    }
    
}
