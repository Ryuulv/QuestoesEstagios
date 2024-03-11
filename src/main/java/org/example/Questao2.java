package org.example;
import java.util.Scanner;

public class Questao2 {
    public static boolean Fibonacci(int n) {
        int a = 0;
        int b = 1;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int checkarNumero = scanner.nextInt();

        if (Fibonacci(checkarNumero)) {
            System.out.println(checkarNumero + " está na sequência de Fibonacci.");
        } else {
            System.out.println(checkarNumero + " não está na sequência de Fibonacci.");
        }
    }
}