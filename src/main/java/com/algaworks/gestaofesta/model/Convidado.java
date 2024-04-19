package com.algaworks.gestaofesta.model;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Convidado implements Serializable {
private static final long serialVersionUID = 1L;

@Id @GeneratedValue(generator = "increment")
@GenericGenerator(name = "increment",strategy = "increment")
private Long id;
private String nome;
private int qtdConvidado;




public Convidado() {
}

public Convidado(String nome, int qtdConvidado) {
    this.nome = nome;
    this.qtdConvidado = qtdConvidado;
}

public Convidado(Long id, String nome, int qtdConvidado) {
    this.id=id;
    this.nome = nome;
    this.qtdConvidado = qtdConvidado;
}

public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getQtdConvidado() {
    return qtdConvidado;
}
public void setQtdConvidado(int qtdConvidado) {
    this.qtdConvidado = qtdConvidado;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Convidado other = (Convidado) obj;
    if (id == null) {
        if (other.id != null)
            return false;
    } else if (!id.equals(other.id))
        return false;
    return true;
}



}
