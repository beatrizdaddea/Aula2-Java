/*
Fazer um programa para que o usuário entre com um número inteiro. 
Após isso, o programa deve calcular o termo correspondente da sequência de Fibonacci. 
Primeiros números da sequência: 0, 1, 1, 2, 3, 5 ... Para se calcular o próximo termo da sequência de Fibonacci, é necessário somar os dois termos anteriores
 */
package aula2;

import java.util.Scanner;

public class Ex2 {
    static long fibonacci(int n){
        int sequencial;
        int fib=0;
        int fant=0;
        
        for(sequencial=1; sequencial<=n; sequencial++){
            if(sequencial ==1){
                fib =1;
                fant=0;
            }
            else{
                fib =fib+fant;
                fant=fib-fant;
            }
        }
          return fib; // quando a classe for dinamica precisa do return
     }
    
   
public static void main(String[] args) 
{
    int n;
    int sequencial;
    
    Scanner fib = new Scanner(System.in);
    System.out.println("Digite a posição: ");
    n=fib.nextInt();
    
    for (sequencial=0; sequencial<n;sequencial++){
        System.out.println("(" + sequencial +") :" + Ex2.fibonacci(sequencial)+"\t");
    }
}
    
    
    
}
   

