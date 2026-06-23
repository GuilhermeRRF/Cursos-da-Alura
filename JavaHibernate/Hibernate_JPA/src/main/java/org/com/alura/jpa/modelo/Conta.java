package org.com.alura.jpa.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Conta  {

    @Id// nessa nova versao é necessario para o uso da java primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)// nessa nova versao é necessario para o uso da java primaria
    private Long id;

private Integer agencia ;

private Integer numero;

private String titular;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitular(){

    return titular;

}

public void setTitular(String t){

    this.titular = t;

}

public Integer getAgencia (){

    return agencia;

}

public void setAgencia(Integer a){

this.agencia = a;

}

public Integer getNumero(){

    return numero;

}

public void setNumero(Integer n){

    this.numero = n;

}



}
