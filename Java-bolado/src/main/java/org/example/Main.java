// https://app.codility.com/programmers/trainings/7/

package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> ListaMaluca = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "º valor: ");
            int num = sc.nextInt();
            ListaMaluca.add(num);
        }
       contarNos(ListaMaluca);
    }

    public static void contarNos(List<Integer> arrayRecebido){
        int i = 0;
        int cont = 0;
        List<Integer> array = new ArrayList <Integer>();
        while (i != -1) {
            array.add(i);
            cont += 1;
            i = arrayRecebido.get(i);
        }
        System.out.println("Contador " + cont);
        System.out.println("Array recebido " + arrayRecebido);
        System.out.println("Array final " + array);
    }
}


/* 
É fornecida uma matriz A não vazia, composta por N inteiros.

O array A representa uma lista encadeada. Uma lista é construída a partir deste array da seguinte forma:

o primeiro nó (a cabeça) está localizado no índice 0;
o valor de um nó localizado no índice K é A[K];
se o valor de um nó for −1 então ele é o último nó da lista;
caso contrário, o sucessor de um nó localizado no índice K está localizado no índice A[K] (você pode assumir que A[K] é um índice válido, ou seja, 0 ≤ A[K] < N).
Por exemplo, para a matriz A tal que:

  Um[0] = 1
  Um[1] = 4
  Um[2] = -1
  Um[3] = 3
  Um[4] = 2


a seguinte lista é construída:

o primeiro nó (a cabeça) está localizado no índice 0 e tem valor 1;
o segundo nó está localizado no índice 1 e tem valor 4;
o terceiro nó está localizado no índice 4 e tem valor 2;
o quarto nó está localizado no índice 2 e tem um valor de -1.
Escreva uma função:

classe Solução { public int solução(int[] A); }

que, dado um array não vazio A consistindo de N inteiros, retorna o comprimento da lista construída a partir de A da maneira acima.

Por exemplo, dado o array A tal que:

  Um[0] = 1
  Um[1] = 4
  Um[2] = -1
  Um[3] = 3
  Um[4] = 2
a função deve retornar 4, conforme explicado no exemplo acima.

Suponha que:

N é um inteiro dentro do intervalo [ 1 .. 200.000 ];
cada elemento da matriz A é um inteiro dentro do intervalo [ −1 .. N-1 ];
sempre será possível construir a lista e seu comprimento será finito.
*/
