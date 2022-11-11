package br.inatel.exeptions;

public class CandidatoInvalidException extends Exception{

    public CandidatoInvalidException() {
        System.out.println("Numero de candidato invalido!");
    }
}