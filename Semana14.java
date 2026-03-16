/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana14;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Semana14 {
    
    static double CalculoArea(double b, double h){
        return(b*h);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double b, h;
        System.out.println("Calculo de area de un rectangulo ");
        System.out.print("Ingrese la base: ");
        b=sc.nextDouble();
        System.out.print("Ingrese la altuta: ");
        h=sc.nextDouble();
        double resp=CalculoArea(b,h);
        System.out.println("El area es: "+resp);

    }   
   
}
