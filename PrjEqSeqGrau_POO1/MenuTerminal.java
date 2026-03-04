package com.poo.prjeqseqgrau_poo1.PrjEqSeqGrau_POO1;
import java.util.Scanner;

public class MenuTerminal {
    public int mostrarOpcoes(Scanner sc) {
        System.out.println("\n========== MENU PRINCIPAL ==========");
        System.out.println("1. Calculadora Normal (+, -, *, /)");
        System.out.println("2. Calculadora de Equação do 2º Grau");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        return sc.nextInt();
    }
    }

