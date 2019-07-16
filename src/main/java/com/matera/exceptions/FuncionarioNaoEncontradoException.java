package com.matera.exceptions;

import java.io.IOException;

public class FuncionarioNaoEncontradoException extends Exception {
    public FuncionarioNaoEncontradoException(String message){
        super(message);
    }

}
