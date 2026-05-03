package com.grilocode.sistemaescolar.servico;

public class CalculadorMedia {
    public double calcularMedia (double[] notas ){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }
}
