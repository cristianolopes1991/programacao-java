package com.secao06;

//Tipos de dados alfanuméricos
//caracteres e strings
public class Programa13 {

    public static void main(String[] args) {
        //Tipos primitivos
        char letra = 'a'; //Aspas simples
        char letra2 = 97;
        letra2 = (char) (letra2 + 1); //cast

        System.out.println("Letra " + letra);
        System.out.println("Letra2 " +letra2);

        //Tipos não primitivos
        Character letra3 = 'A';
        String nome = "Geek University";

        System.out.println("Letra3 " + letra3);

        System.out.println("char/Character " + Character.SIZE + " bits");

        System.out.println("Valor Min char/Character " + Character.MIN_VALUE);
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE);

        System.out.println("Nome " + nome);

        System.out.println("String " + (Character.SIZE * nome.length()) + " bits");



    }
}
