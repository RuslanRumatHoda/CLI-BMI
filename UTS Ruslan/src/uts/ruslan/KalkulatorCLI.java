/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.ruslan;

/**
 *
 * @author Ruslan Rumat Hoda
 */
import java.util.Scanner;
public class KalkulatorCLI {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //TODO code aplication logic here
    ModuleUtama();    
    }
    public static void ModuleUtama(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[pilihan]");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.print("Masukan Pilihan Anda : ");
        int choice = s.nextInt();
        switch (choice){
            case 1: ModuleTambah(); Break;
            case 2: ModuleKurang(); Break;
            case 3: ModuleKali(); Break;
            case 4: ModuleBagi(); Break;
            
        }
         
    }
     public static void ModuleTambah(){
         Scanner s = new Scanner(System.in);
         System.out.println("\n[penjumlahan]");
         System.out.println("Masukan Nilai pertama:");
         Double num1 = s.nextDouble();
         System.out.println("Masukan Nilai kedua:");
         Double num2 = s.nextDouble();
         System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "+" + String.valueOf(num2) + " Adalah " + (num1 + (num2)));
          
         ModuleUtama();
           
     }
     public static void ModuleKurang(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[pengurangan]");
        System.out.println("Masukan Nilai pertama:");
        Double num1 = s.nextDouble();
        System.out.println("Masukan Nilai kedua:");
        Double num2 = s.nextDouble();
        System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "-" + String.valueOf(num2) + " Adalah " + (num1 - (num2)));
          
        ModuleUtama();
     }
      public static void ModuleKali(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[perkalian]");
        System.out.println("Masukan Nilai pertama:");
        Double num1 = s.nextDouble();
        System.out.println("Masukan Nilai kedua:");
        Double num2 = s.nextDouble();
        System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "*" + String.valueOf(num2) + " Adalah " + (num1 * (num2)));
          
        ModuleUtama();
     }
      public static void ModuleBagi(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n[pembagian]");
        System.out.println("Masukan Nilai pertama:");
        Double num1 = s.nextDouble();
        System.out.println("Masukan Nilai kedua:");
        Double num2 = s.nextDouble();
        System.out.println("Maka Nilai Dari " + String.valueOf(num1) + "/" + String.valueOf(num2) + " Adalah " + (num1 / (num2)));          
}
}