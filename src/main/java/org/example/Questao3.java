package org.example;

public class Questao3 {
    //Letra A
    public static int letraA(int ultimoN) {
        return ultimoN + 2;
    }
    //Letra B
    public static int letraB(int ultimoN){
        return ultimoN*2;
    }
    //Letra C
    public static int letraC(int ultimoN) {
        return (int) Math.pow(Math.sqrt(ultimoN) + 1, 2);
    }
    //Letra D
    public static int letraD(int ultimoN) {
        return ultimoN + 4 * ((int) Math.sqrt(ultimoN) + 1);
    }
    //Letra E
    public static int letraE(int ultimoN, int penultimoN) {
        return ultimoN + penultimoN;
    }
    //Letra F nao consegui compreender a sequencia
    public static int letraF(int ultimoN) {
       return 0;
    }
    public static void main(String[] args) {
        int ultimo;

        // Letra A
        ultimo = 7;
        System.out.println("Próximo número na sequência a): " + letraA(ultimo));

        // Letra B
        ultimo = 64;
        System.out.println("Próximo número na sequência b): " + letraB(ultimo));

        // Letra C
        ultimo = 36;
        System.out.println("Próximo número na sequência c): " + letraC(ultimo));

        // Letra D
        ultimo = 64;
        System.out.println("Próximo número na sequência d): " + letraD(ultimo));

        //letra E
        int penultimoE = 5;
        ultimo = 8;
        System.out.println("Próximo número na sequência e): " + letraE(penultimoE, ultimo));

      //letra F
        ultimo = 19;
        System.out.println("Próximo número na sequência f): " + letraF(ultimo));
    }
}

