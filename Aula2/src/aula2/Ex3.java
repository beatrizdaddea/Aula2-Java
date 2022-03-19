/*
Muitos não sabem, mas o Real não foi aúnica moeda que circulou pelo Brasil.Antes do plano Real(1994-atualmente), o nome da nossa moeda era Cruzeiro Real (1993-1994) e antes disso era o Cruzeiro(1990-1993). Criar um programa que converta uma quantia em Real, para Cruzeiro Real e Cruzeiro.
Para transformar o Real em Cruzeiro Real, basta multiplicar o valor em reais por 2.750.
Para transformar o Cruzeiro Real em Cruzeiro, basta multiplicar o valor por 1.000.
 */
package aula2;

import java.util.Scanner;

public class Ex3 {
        public static void main(String[] args) {
        float real;
        float cruzeiro;
        float cruzeiro_real;
        
        Scanner Conversao = new Scanner(System.in);
        System.out.println("Insira o valor em real: ");
        real = Conversao.nextFloat();
        cruzeiro_real = real * 2750;
        cruzeiro = cruzeiro_real*1000;
        System.out.println("Valor em Cruzeiro:  " + cruzeiro);
        System.out.println("Valor em Real:  "+ cruzeiro_real);
  
        }
}
