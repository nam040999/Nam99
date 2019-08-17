/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giai.pt.bac.pkg1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class GiaiPtBac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        Scanner sc = new Scanner (System.in);
        double a;
        double b;
        double x;
        double T;
        double H;
        double N;
        double C;
        System.out.println("Giai phuong trinh ax + b = 0");
        System.out.printf("Nhap gia tri a: ");
        a = sc.nextDouble();
        System.out.printf("Nhap gia tri b: ");
        b = sc.nextDouble();
        if (a == 0){
            if (b == 0){System.out.println("phuong trinh co vo so nghiem");}
            else {System.out.println("phuong trinh vo nghiem");}
            } else {
            x = (double) -b/a;
            System.out.println("nghiem cua phuong trinh la: " +x );
    
        }
        T = (double) a+b;
        System.out.println("Tong a + b = " +T);
        H = (double) a-b;
        System.out.println("Hieu a - b = " +H);
        N = (double) a*b;
        System.out.println("Tich a * b = " +N);
        C = (double) a/b;
        if (b == 0) {System.out.println("Khong ton tai a / b");
        } else { System.out.println("Thuong a / b = " +C);
        }
        
    }
    
}
