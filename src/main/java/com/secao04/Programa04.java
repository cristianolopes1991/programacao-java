package com.secao04;

//if, else, else if
public class Programa04 {
    public static void main(String[] args) {
        //Declarando e inicializando a variável
        int numero = 5;

        //se (numero > 5 ) então
        if(numero > 5 ){
            System.out.println("Sim, o número "+ numero + " é maior que 5");

        } else if(numero == 5) {
            System.out.println("Não, o número "+ numero + " é igual a 5");

        } else if(numero %2 == 0) {
            System.out.println("O número "+ numero + " é par.");

        } else {
            System.out.println("Não, o número "+ numero + " não é maior do que 5");
        }
    }
}
