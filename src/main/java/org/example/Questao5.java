package org.example;
import java.util.Scanner;

public class Questao5 {

        public static String invertePalavra(String str) {
            char[] letra= str.toCharArray();

            int ini = 0;
            int fim = letra.length - 1;
            while (ini < fim) {
                char temp = letra[ini];
                letra[ini] =letra[fim];
                letra[fim] = temp;
                ini++;
                fim--;
            }

            return new String(letra);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma palavra: ");
            String entrada = scanner.nextLine();


            String invertida = invertePalavra(entrada);

            System.out.println("String invertida: " + invertida);

            scanner.close();
        }
    }

