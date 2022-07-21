/*O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays,
uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.
Deve-se permitir que, ao indicar o índice do vetor, seja indicado qual funcionário
está armazenado dentro dessa memória. */

package Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = input.nextLine();
        }

        int posicao = input.nextInt();

        System.out.println(nomes[posicao]);

        input.close();
    }

}
