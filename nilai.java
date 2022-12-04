/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanukl;

import java.util.Scanner;

/**
 *
 * @author mokle
 */
public class kategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input1,input2,input3,input4,input5,nilai;
        
        System.out.print("Input nilai Pertama: ");
        input1 = input.nextInt();
        
        System.out.print("Input nilai Kedua: ");
        input2 = input.nextInt();
        
        System.out.print("Input nilai Ketiga: ");
        input3 = input.nextInt();
        
        System.out.print("Input nilai Keempat: ");
        input4 = input.nextInt();
        
        System.out.print("Input nilai Kelima: ");
        input5 = input.nextInt();
        
        System.out.println("");
        nilai = input1;
        
        if (nilai<=60) {
            System.out.println("Input pertama : "+nilai+", nilai kurang");
        }else if(nilai>60&&nilai<=70){
            System.out.println("Input pertama : "+nilai+", nilai cukup");
        }else if(nilai>70&&nilai<=80){
            System.out.println("Input pertama : "+nilai+", nilai baik");
        }else if(nilai>80&&nilai<=100){
            System.out.println("Input pertama : "+nilai+", nilai luar binasa");
        }else if(nilai>100){
            System.out.println("Input pertama : NaN");
        };
        
        nilai = input2;
        
        if (nilai<=60) {
            System.out.println("Input kedua : "+nilai+", nilai kurang");
        }else if(nilai>60&&nilai<=70){
            System.out.println("Input kedua : "+nilai+", nilai cukup");
        }else if(nilai>70&&nilai<=80){
            System.out.println("Input kedua : "+nilai+", nilai baik");
        }else if(nilai>80&&nilai<=100){
            System.out.println("Input kedua : "+nilai+", nilai luar binasa");
        }else if(nilai>100){
            System.out.println("Input kedua : NaN");
        };
        
        nilai = input3;
        
        if (nilai<=60) {
            System.out.println("Input ketiga : "+nilai+", nilai kurang");
        }else if(nilai>60&&nilai<=70){
            System.out.println("Input ketiga : "+nilai+", nilai cukup");
        }else if(nilai>70&&nilai<=80){
            System.out.println("Input ketiga : "+nilai+", nilai baik");
        }else if(nilai>80&&nilai<=100){
            System.out.println("Input ketiga : "+nilai+", nilai luar binasa");
        }else if(nilai>100){
            System.out.println("Input ketiga : NaN");
        };
        
        nilai = input4;
        
        if (nilai<=60) {
            System.out.println("Input keempat : "+nilai+", nilai kurang");
        }else if(nilai>60&&nilai<=70){
            System.out.println("Input keempat : "+nilai+", nilai cukup");
        }else if(nilai>70&&nilai<=80){
            System.out.println("Input keempat : "+nilai+", nilai baik");
        }else if(nilai>80&&nilai<=100){
            System.out.println("Input keempat : "+nilai+", nilai luar binasa");
        }else if(nilai>100){
            System.out.println("Input keempat : NaN");
        };
        
        nilai = input5;
        
        if (nilai<=60) {
            System.out.println("Input kelima : "+nilai+", nilai kurang");
        }else if(nilai>60&&nilai<=70){
            System.out.println("Input kelima : "+nilai+", nilai cukup");
        }else if(nilai>70&&nilai<=80){
            System.out.println("Input kelima : "+nilai+", nilai baik");
        }else if(nilai>80&&nilai<=100){
            System.out.println("Input kelima : "+nilai+", nilai luar binasa");
        }else if(nilai>100){
            System.out.println("Input kelima : NaN");
        };
    }
}
