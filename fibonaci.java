jurnal8_6306120050
==================
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaci;

import java.util.Scanner;

/**
 *
 * @author Asisten
 */
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
    public static long fibonaci(int f){
        if(f<=1){
            return f;
        }else{
            return fibonaci(f-1) + fibonaci(f-2);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner (System.in);
        int f;
        System.out.println("Masukkan angkanya :");
        f=r.nextInt();int x=0;
        System.out.println("hasil : ");
        for(int i=1;i<=f;i++){
x+=fibonaci(i);}
            System.out.print(x);
        }
    }
    

