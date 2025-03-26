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