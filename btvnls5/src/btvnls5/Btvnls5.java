/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnls5;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Btvnls5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
        System.out.println("Do dai cua mang A la : ");
        int doDaia = sc.nextInt();
        System.out.println("Do dai cua mang B la : ");
        int doDaib = sc.nextInt();
        int[] a = new int[doDaia];
        int[] b = new int[doDaib];
        int doDaic = doDaia + doDaib;
        int[] c = new int[doDaic];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Cac phan tu trong mang A gom : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("Cac phan tu trong mang B gom : ");
            b[i] = sc.nextInt();
        }
        for (int k = 0; k < a.length; k++) {
            for (int i = k; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println("mang A la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");

        }
        System.out.println("");
        for (int k = 0; k < b.length; k++) {
            for (int i = k; i < b.length - 1; i++) {
                if (b[i] > b[i + 1]) {
                    int temp1 = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = temp1;
                }
            }
        }
        System.out.println("mang B la: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",");
        }
        System.out.println("");
        int bienA = 0;
        int bienB = 0;
        int bienC = 0;
        while (bienA < doDaia && bienB < doDaib) {
            if (a[bienA] < b[bienB]) {
                c[bienC++] = a[bienA++];
            } else {
                c[bienC++] = b[bienB++];
            }
        }
        while (bienA < doDaia) {
            c[bienC++] = a[bienA++];
        }
        while (bienB < doDaib) {
            c[bienC++] = b[bienB++];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }
    }
    
}
