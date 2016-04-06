/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyanendra.sc;
import java.util.Scanner;
/**
 *
 * @author ghale
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("Enter your choice 1-4");
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter First Number");
        int x=input.nextInt();
        System.out.println("Ënter Second Number");
        int y=input.nextInt();
        
       menu();
        
        int choice=input.nextInt();
        
        int total=process(choice,x,y);
        
        System.out.println("Output is " + total);
    }
    private static int process(int choice, int x, int y){
        int total=0;
        switch(choice){
            case 1:
                total=x+y;
                break;
            case 2:
                total=x-y;
                break;
            case 3:
                total=x*y;
                break;
            case 4:
                total=x/y;
                break;
            default:
                   System.out.println("Invalid Choice");
                   break;
        }
        return total;
    }
}
