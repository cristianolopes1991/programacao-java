package com.secao06;
//Tipos booleanos
public class Programa14 {
    public static void main(String[] args) {
        //Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        //Tipos não primitivos
        Boolean v = true;
        boolean f = false;

        System.out.println("verdadeiro " + verdadeiro);
        System.out.println("falso " + falso);
        System.out.println("v " + v);
        System.out.println("f " + f);

        if(verdadeiro == true) {
            System.out.println("É verdadeiro");
        } else {
            System.out.println("É falso");
        }

        if(1 == 3) {
            System.out.println(" 1 == 1 é verdadeiro");
        } else {
            System.out.println("... é falso");
        }
    }
}

/*
*if(realiza uma verificação que no final retorna ou true ou false
*/
