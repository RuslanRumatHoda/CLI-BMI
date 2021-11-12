/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.ruslan;

/**
 *
 * @author Ruslan Rumat Hoda
 */
public class BMI {
    public static void main(String[] args) {
        int beratbadan = 90;
        float tinggibadan = 1.69f;
        float bmi = (beratbadan/(tinggibadan*tinggibadan)) ;
        
        System.out.println("BMI ANDA ADALAH\t:"+bmi);
        
        if (bmi<18.5){
            System.out.println("BERAT BADAN ANDA ADALAH KURANG");
        }
        else if (bmi<24.9){
            System.out.println("BERAT BADAN ANDA ADALAH NORMAL/IDEAL");
        }
        else if (bmi<29.9){
              System.out.println("BERAT BADAN ANDA ADALAH LEBIH");
        }
        else {
            System.out.println("OBESITAS");
        }
    }
}
