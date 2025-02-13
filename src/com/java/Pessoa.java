package com.java;

import java.io.Serial;
import java.io.Serializable;

public class Pessoa implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome (String Nome){
        this.nome = nome;
    }
}
