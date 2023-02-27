package com.secao06;
//Operações Matemáticas
public class Programa15 {

    public static void main(String[] args) {
        int num1 = 5, num2 = 9, res;
        float res2;

        //soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);

        //Subtração
        res = num1 - num2;
        System.out.println("A subtração de " + num1 + " - " + num2 + " é " + res);

        //Multiplicaçao
        res = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);

        //Divisão (Inteira)
        res = num1 / num2;
        System.out.println("A divisão de " + num1 + " / " + num2 + " é " + res);

        //Divisão (Real)
        res2 = (float)num1 / (float) num2;
        System.out.println("A divisão de " + num1 + " * " + num2 + " é " + res2);

        //Módulo
        /*
        *Se o resto do módulo da variável por 2 for 0, a variável
        * é par. Se o resto for 1, a variável é ímpar
        * */
        res = num1 % 2;
        System.out.println("O resto da divisão é par ");
    }
}
