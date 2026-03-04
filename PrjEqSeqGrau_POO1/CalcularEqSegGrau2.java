package com.poo.prjeqseqgrau_poo1.PrjEqSeqGrau_POO1;

public class CalcularEqSegGrau2 {
    public void delta(DadosEntrada de, DadosSaida ds){
        ds.setDelta(de.getB()*de.getB() - (4*de.getA()*de.getC()));


    }
    public void  x1l(DadosEntrada de, DadosSaida ds){
        ds.setX1l((-de.getB())+ (Math.sqrt(ds.getDelta())/(2*de.getA())));

    }
    public void x2l(DadosEntrada de, DadosSaida ds){
        ds.setX2l((-de.getB()) - (Math.sqrt(ds.getDelta()) / (2*de.getA())));

    }
    public void xV (DadosEntrada de, DadosSaida ds){
        ds.setxV(-de.getB() / (2*de.getA()));

    }
    public void yV(DadosEntrada de, DadosSaida ds){
        ds.setyV(-ds.getDelta()/ (4*de.getA()));

    }
}
