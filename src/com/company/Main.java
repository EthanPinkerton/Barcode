package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter barcode: ");
        String barcode = input.next();

        int firstNumbers = 0;
        int secondNumbers = 0;

        for(int i = 0; i < barcode.length(); i++){
            if(i % 2 == 0){
                firstNumbers +=  Integer.parseInt(barcode.charAt(i)+"");
            }else {
                secondNumbers += Integer.parseInt(barcode.charAt(i)+"");
            }
        }

        int finalNumber = (secondNumbers*3) + firstNumbers;
        int temp = 0;
        if(Integer.toString(finalNumber).length()>2){
            for(int i = 2; i < Integer.toString(finalNumber).length(); i++){
                temp += Integer.parseInt(Integer.toString(finalNumber).charAt(i)+"")*10^i;
            }
        }
        int checkDigit = ((Integer.parseInt(Integer.toString(finalNumber).charAt(Integer.toString(finalNumber).length() - 2) + "")) + 1) * 10 - finalNumber +temp;
        System.out.println(checkDigit);

    }
}
