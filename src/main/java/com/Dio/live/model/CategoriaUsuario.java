package com.Dio.live.model;

import java.util.Objects;

public class CategoriaUsuario {
    private long id;
    private String descricao;

    public CategoriaUsuario(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public CategoriaUsuario() {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaUsuario that = (CategoriaUsuario) o;
        return id == that.id && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }
}