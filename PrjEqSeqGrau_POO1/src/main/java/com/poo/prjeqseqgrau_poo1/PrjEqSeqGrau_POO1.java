/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjeqseqgrau_poo1;

/**
 *
 * @author Iftm
 */
public class PrjEqSeqGrau_POO1 {

    public static void main(String[] args) {
       DadosEntrada de = new DadosEntrada();
       de.setA(1);
       de.setB(5);
       de.setC(6);
        System.out.println("DADOS DE ENTRADA");
        System.out.println("A: " +de.getA());
        System.out.println("B: "+de.getB());
        System.out.println("C: "+de.getC());
        CalcularEqSegGrau esg= new CalcularEqSegGrau();
        DadosSaida ds = esg.delta(de);
        ds =esg.x1l(de);
        ds = esg.x2l(de);
        ds = esg.xV(de);
        ds = esg.yV(de);
        System.out.println("DELTA: "+ds.getDelta());
        System.out.println("X: "+ ds.getX1l());
        System.out.println("X²: "+ ds.getX2l());
        System.out.println("xV: "+ ds.getxV());
        System.out.println("yV: "+ ds.getyV());     
    }
}
