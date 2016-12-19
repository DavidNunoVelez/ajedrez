package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;
import java.util.Random;

public class Main {

    static String tablero[][] = new String[8][8];

    static String jugador;
    static final String STR_JUGADOR_BLANCAS = "Blancas";
    static final String STR_JUGADOR_NEGRAS = "Negras";

    static BufferedReader br;

    static final String PEONn = "\u2659";
    static final String TORREn = "\u2656";
    static final String CABALLOn = "\u2658";
    static final String ALFILn = "\u2657";
    static final String REINAn = "\u2655";
    static final String REYn = "\u2654";

    static final String PEONb = "\u265f";
    static final String TORREb = "\u265c";
    static final String CABALLOb = "\u265e";
    static final String ALFILb = "\u265d";
    static final String REINAb = "\u265b";
    static final String REYb = "\u265a";

    static int figuraH;
    static int figuraV;
    static int posicionH;
    static int posicionV;


    public static void iniciarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = "0";
            }
        }
        /*Negras*/
        tablero[0][0] = TORREn;
        tablero[0][1] = CABALLOn;
        tablero[0][2] = ALFILn;
        tablero[0][3] = REINAn;
        tablero[0][4] = REYn;
        tablero[0][5] = ALFILn;
        tablero[0][6] = CABALLOn;
        tablero[0][7] = TORREn;
        tablero[1][0] = PEONn;
        tablero[1][1] = PEONn;
        tablero[1][2] = PEONn;
        tablero[1][3] = PEONn;
        tablero[1][4] = PEONn;
        tablero[1][5] = PEONn;
        tablero[1][6] = PEONn;
        tablero[1][7] = PEONn;
        /*Blancas*/
        tablero[6][0] = PEONb;
        tablero[6][1] = PEONb;
        tablero[6][2] = PEONb;
        tablero[6][3] = PEONb;
        tablero[6][4] = PEONb;
        tablero[6][5] = PEONb;
        tablero[6][6] = PEONb;
        tablero[6][7] = PEONb;
        tablero[7][0] = TORREb;
        tablero[7][1] = CABALLOb;
        tablero[7][2] = ALFILb;
        tablero[7][3] = REINAb;
        tablero[7][4] = REYb;
        tablero[7][5] = ALFILb;
        tablero[7][6] = CABALLOb;
        tablero[7][7] = TORREb;
    }

    public static void visualizarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
                if (j != tablero[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static String randomInicial() {
        /*0 ES PARA BLANCAS, 1 ES PARA NEGRAS*/
        Random inicio = new Random();
        int empezar = inicio.nextInt(2);
        if (empezar == 0) {
            jugador = STR_JUGADOR_BLANCAS;
        } else {
            jugador = STR_JUGADOR_NEGRAS;
        }
        return jugador;
    }

    public static void pedirJugar() throws IOException {
        System.out.println(jugador + " elije figura a mover,horizontales de A a H y verticales de 1 a 8:");
        System.out.println("Ejemplo: c2, h7, b3,...");
        String figura = br.readLine().toLowerCase();
        char horizontalesF = figura.charAt(0);
        char verticalesF = figura.charAt(1);

        System.out.println(jugador + " elije posicion donde mover,horizontales de A a H y verticales de 1 a 8:");
        System.out.println("Ejemplo: c2, h7, b3,...");
        String posicion = br.readLine().toLowerCase();
        char horizontalesP = posicion.charAt(0);
        char verticalesP = posicion.charAt(1);
        convertirJugada(horizontalesF, verticalesF, horizontalesP, verticalesP);
    }

    public static void convertirJugada(char horizontalF, char verticalF, char horizontalP, char verticalP) {
        switch (horizontalF) {
            case 'a':
                figuraH = 0;
                break;
            case 'b':
                figuraH = 1;
                break;
            case 'c':
                figuraH = 2;
                break;
            case 'd':
                figuraH = 3;
                break;
            case 'e':
                figuraH = 4;
                break;
            case 'f':
                figuraH = 5;
                break;
            case 'g':
                figuraH = 6;
                break;
            case 'h':
                figuraH = 7;
                break;
        }
        switch (horizontalP) {
            case 'a':
                posicionH = 0;
                break;
            case 'b':
                posicionH = 1;
                break;
            case 'c':
                posicionH = 2;
                break;
            case 'd':
                posicionH = 3;
                break;
            case 'e':
                posicionH = 4;
                break;
            case 'f':
                posicionH = 5;
                break;
            case 'g':
                posicionH = 6;
                break;
            case 'h':
                posicionH = 7;
                break;
        }
        switch (verticalF) {
            case '8':
                figuraV = 0;
                break;
            case '7':
                figuraV = 1;
                break;
            case '6':
                figuraV = 2;
                break;
            case '5':
                figuraV = 3;
                break;
            case '4':
                figuraV = 4;
                break;
            case '3':
                figuraV = 5;
                break;
            case '2':
                figuraV = 6;
                break;
            case '1':
                figuraV = 7;
                break;
        }
        switch (verticalP) {
            case '8':
                posicionV = 0;
                break;
            case '7':
                posicionV = 1;
                break;
            case '6':
                posicionV = 2;
                break;
            case '5':
                posicionV = 3;
                break;
            case '4':
                posicionV = 4;
                break;
            case '3':
                posicionV = 5;
                break;
            case '2':
                posicionV = 6;
                break;
            case '1':
                posicionV = 7;
                break;
        }
    }

    public static boolean sePuedeMover(int figuraHorizontal, int figuraVertical,
                                       int posicionHorizontal, int posicionVertical) {
        if(mismoColorFigurasJugador(figuraHorizontal, figuraVertical,
        posicionHorizontal, posicionVertical) && destinoPosible(figuraHorizontal, figuraVertical,
                posicionHorizontal, posicionVertical)){
            return true;
        }
        return false;
    }

    private static boolean destinoPosible(int figuraHorizontal, int figuraVertical,
                                          int posicionHorizontal, int posicionVertical) {
    return true;
    }

    ///TODO
    private static boolean mismoColorFigurasJugador(int figuraHorizontal, int figuraVertical,
                                             int posicionHorizontal, int posicionVertical) {
    return true;
    }

    public static void moverFicha(int figuraHorizontal, int figuraVertical,
                                  int posicionHorizontal, int posicionVertical) {
        tablero[posicionVertical][posicionHorizontal] = tablero[figuraVertical][figuraHorizontal];
        tablero[figuraVertical][figuraHorizontal] = "0";
    }
///TODO: SE PUEDEN COMER FICHAS DE SU PROPIO COLOR, CORREGIR!
    public static boolean capturas (int figuraHorizontal, int figuraVertical,
                                    int posicionHorizontal, int posicionVertical){

        if(tablero[figuraVertical][figuraHorizontal]!= tablero[posicionVertical][posicionHorizontal]&&
            !tablero[posicionVertical][posicionHorizontal].equalsIgnoreCase("0")){

             return true;
        }else {
            return false;
        }
    }

    public static String cambiarJugador() {

        if (jugador.equalsIgnoreCase(STR_JUGADOR_BLANCAS)) {
            jugador = STR_JUGADOR_NEGRAS;
        } else {
            jugador = STR_JUGADOR_BLANCAS;
        }
        return jugador;
    }
///TODO:
    public static boolean hayJakeMate() {

        return false;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        iniciarTablero();
        visualizarTablero();
        System.out.println("Empiezan " + randomInicial());
        do {
            pedirJugar();
            if (sePuedeMover(figuraH, figuraV, posicionH, posicionV)) {
                if(capturas(figuraH,figuraV, posicionH,posicionV)){
                    System.out.println(jugador+" has capturado "+tablero[posicionV][posicionH]);
                }else{
                    System.out.println("No has capturado ninguna");
                }
                moverFicha(figuraH, figuraV, posicionH, posicionV);
                visualizarTablero();
                cambiarJugador();
            }
        } while (!hayJakeMate());

    }
}
