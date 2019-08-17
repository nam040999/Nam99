/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.b2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PtB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Giai pt bac 2
        Scanner sc = new Scanner (System.in);
        double a;
        double b;
        double c;
        double x;
        double Delta;
        double E;
        double x1;
        double x2;
        System.out.println("Giai phuong trinh ax^2 + bx + c = 0 ");
        System.out.printf("Gia tri cua a: ");
        a = sc.nextDouble();
        System.out.printf("Gia tri cua b: ");
        b = sc.nextDouble();
        System.out.printf("Gia tri cua c: ");
        c = sc.nextDouble();
        if (a == 0){
            if (b == 0){
            if (c == 0){System.out.println("phuong trinh co vo so nghiem");}
            else {System.out.println("phuong trinh vo nghiem");}
            } else {
            x = (double) -c/b;
            System.out.println("nghiem cua phuong trinh la: " +x );
        }
        } else { 
           Delta = (double)((b*b)-(4*a*c));
           E = (double) Math.sqrt(Delta);
           if(Delta < 0){
               System.out.println("phuong trinh vo nghiem");
           } else if (Delta == 0) {
               x = (double) (-b/(2*a));
               System.out.println("phuong trinh co nghiem kep x1=x2=" +x);
        }else {
           x1 = (double) ((-b - E)/(2*a));
           x2 = (double) ((-b + E)/(2*a));
            System.out.println("Phuong trinh co 2 nghiem la x1,x2");
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);}
        }
            
    }
    
}
