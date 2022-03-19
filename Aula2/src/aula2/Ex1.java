/*
Fazer um programa para calcular o fatorial de um número. 
Para se calcular o fatorial de um número, é necessário multiplicar ele portodos os seus antecessores até chegar número 1. 
Exemplo: para calcular o fatorial de 5 é necessário multiplicar 5 x 4 x 3 x 2 x 1.
 */



package aula2;

import javax.swing.JOptionPane;

public class Ex1 
{
    public static void main(String[] args) 
    {
        int n;
        int fatorial = 1;
        String num = JOptionPane.showInputDialog("Digite um número: ");
        n = Integer.parseInt(num);
        if (n == 0)
            System.out.println(fatorial);
        else if (n < 0)
            System.out.println("Não existe fatorial de número negativo.");
        else    
            for (fatorial = n; n > 1; n--)
            {
                fatorial = fatorial * (n-1);
                System.out.println(fatorial);   
            }
    }
    
}
