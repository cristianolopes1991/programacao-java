package com.secao06;

//Tipos de dados
//Númericos (Inteiros e Reais)
public class Programa11 {

    public static void main(String[] args) {
        //Tipos primários / primitivos
        long num0 = 99;
        int num1 = 4; //Inteiro 99999999999999999999
        short num2 = 4; //Inteiro (curto/menor/baixo) 9999999
        byte num3 = 4;

        //Tipos não primários/ não primitivos
        Integer num4 = 98;
        Short num5= 7;
        Byte num6 = 9;
        Long num7 = 99999999l;

        System.out.println("long -> Num0 = " + num0);
        System.out.println("int -> Num1 = " + num1);
        System.out.println("short -> Num2 = " + num2);
        System.out.println("byte -> Num3 = " + num3);
        System.out.println("Integer -> Num4 = " + num4);
        System.out.println("Short -> Num5 = " + num5);
        System.out.println("Byte -> Num6 = " + num6);

        System.out.println("int/Integer" + Integer.SIZE + " bits");
        System.out.println("short/Short" + Short.SIZE + " bits");
        System.out.println("byte/Byte" + Byte.SIZE + " bits");

        System.out.println("Valor Min int/Integer " + Integer.MIN_VALUE);
        System.out.println("Valor Max int/Integer " + Integer.MAX_VALUE);

    }
}
