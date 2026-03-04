package com.poo.prjeqseqgrau_poo1.PrjEqSeqGrau_POO1;

public class CalcularEqSegGrau {
    DadosSaida ds = new DadosSaida();
    public DadosSaida delta(DadosEntrada de){
        ds.setDelta(de.getB()*de.getB() - (4*de.getA()*de.getC()));
        return ds;

    }
    public DadosSaida x1l(DadosEntrada de){
        ds.setX1l((-de.getB())+ (Math.sqrt(ds.getDelta())/(2*de.getA())));
        return ds;
    }
    public DadosSaida x2l(DadosEntrada de){
        ds.setX2l((-de.getB()) - (Math.sqrt(ds.getDelta()) / (2*de.getA())));
        return ds;
    }
    public DadosSaida xV (DadosEntrada de){
        ds.setxV(-de.getB() / (2*de.getA()));
        return ds;
    }
    public DadosSaida yV(DadosEntrada de){
        ds.setyV(-ds.getDelta()/ (4*de.getA()));
        return ds;
    }
}
