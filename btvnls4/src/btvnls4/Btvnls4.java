/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnls4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Btvnls4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [5][5];
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Nhap vao phan tu["+ i +"]["+ j +"]  cua mang : ");
                a[i][j] = sc.nextInt();
    }  
}
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("phan tu [" + i + "][" + j + "] : " + a[i][j]);
}
}
       int sum = 0;
       for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
                
}
       
}
      System.out.println("tong cac phan tu trong mang la: " +sum);
      for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]%3==0)System.out.println("phan tu chia het cho 3 la : " +a[i][j] );
}
}     
      for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                int count = 0;
                for (int k = 1; k <= a[i][j]; k++) {
                    if (a[i][j]%k==0){
                    count++;
                }                 
} if (count==2) {System.out.println("so nguyen to trong mang la : " +a[i][j]);
} 

}
}
}
}