package br.inatel.exeptions;

public class CPFInvalidException extends Exception{

    public CPFInvalidException() {
        System.out.println("O cpf inserido é invalido!");
    }
}
