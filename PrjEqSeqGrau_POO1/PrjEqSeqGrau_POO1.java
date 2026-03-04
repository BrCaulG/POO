package com.poo.prjeqseqgrau_poo1.PrjEqSeqGrau_POO1;
import java.util.Scanner;
public class PrjEqSeqGrau_POO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuTerminal menu = new MenuTerminal();

        int opcao = -1;


        while (opcao != 0) {


            opcao = menu.mostrarOpcoes(sc);

            if (opcao == 1) {

                System.out.println("\n--- Calculadora Normal ---");
                System.out.print("Primeiro número: ");
                double num1 = sc.nextDouble();
                System.out.print("Segundo número: ");
                double num2 = sc.nextDouble();

                System.out.println("Escolha a operação: 1(+) 2(-) 3(*) 4(/)");
                int op = sc.nextInt();

                if (op == 1) System.out.println("Resultado: " + (num1 + num2));
                else if (op == 2) System.out.println("Resultado: " + (num1 - num2));
                else if (op == 3) System.out.println("Resultado: " + (num1 * num2));
                else if (op == 4) System.out.println("Resultado: " + (num1 / num2));
                else System.out.println("Operação inválida!");

            } else if (opcao == 2) {

                System.out.println("\n--- Equação do 2º Grau ---");
                DadosEntrada de = new DadosEntrada();

                // O seu jeito original de ler as variáveis
                System.out.print("Digite o valor de A: ");
                int a = sc.nextInt();
                de.setA(a);
                sc.nextLine();

                System.out.print("Digite o valor de B: ");
                int b = sc.nextInt();
                de.setB(b);
                sc.nextLine();

                System.out.print("Digite o valor de C: ");
                int c = sc.nextInt();
                de.setC(c);
                sc.nextLine();

                System.out.println("DADOS DE ENTRADA");
                System.out.println("A: " + de.getA());
                System.out.println("B: " + de.getB());
                System.out.println("C: " + de.getC());

                DadosSaida ds = new DadosSaida();
                CalcularEqSegGrau2 esg2 = new CalcularEqSegGrau2();
                esg2.delta(de, ds);
                esg2.x1l(de, ds);
                esg2.x2l(de, ds);
                esg2.xV(de, ds);
                esg2.yV(de, ds);

                System.out.println("DELTA: " + ds.getDelta());
                System.out.println("X: " + ds.getX1l());
                System.out.println("X²: " + ds.getX2l());
                System.out.println("xV: " + ds.getxV());
                System.out.println("yV: " + ds.getyV());


            } else if (opcao == 0) {
                System.out.println("\nSaindo do sistema...");
            } else {
                System.out.println("\nOpção inválida!");
            }
        }
    }






        /*Scanner sc = new Scanner(System.in);
        DadosEntrada de = new DadosEntrada();
        //int a =sc.nextInt();

        int a =sc.nextInt();
        de.setA(a);
        sc.nextLine();
        //de.setA();
        int b = sc.nextInt();
        de.setB(b);
        sc.nextLine();
        int c = sc.nextInt();
        de.setC(c);
        sc.nextLine();

        System.out.println("DADOS DE ENTRADA");
        System.out.println("A: " +de.getA());
        System.out.println("B: "+de.getB());
        System.out.println("C: "+de.getC());

        // CalcularEqSegGrau esg= new CalcularEqSegGrau();
        // DadosSaida ds = esg.delta(de);
        // ds =esg.x1l(de);
        // ds = esg.x2l(de);
        // ds = esg.xV(de);
        // ds = esg.yV(de);

        DadosSaida ds= new DadosSaida();
        CalcularEqSegGrau2 esg2 = new CalcularEqSegGrau2();
        esg2.delta(de,ds);
        esg2.x1l(de, ds);
        esg2.x2l(de, ds);
        esg2.xV(de, ds);
        esg2.yV(de, ds);

        System.out.println("DELTA: "+ds.getDelta());
        System.out.println("X: "+ ds.getX1l());
        System.out.println("X²: "+ ds.getX2l());
        System.out.println("xV: "+ ds.getxV());
        System.out.println("yV: "+ ds.getyV());*/

    }

