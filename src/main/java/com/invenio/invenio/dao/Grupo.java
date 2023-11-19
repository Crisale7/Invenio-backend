package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.List;

// Grupo
@Entity
@Table(name="Grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "grupo_id")
    private int grupo_id;
    @Column(name = "grupo")
    private String grupo;
    @OneToMany(mappedBy = "grupo")
    private List<Rol> roles;

    public Grupo() {
    }

    public Grupo(int grupo_id, String grupo) {
        this.grupo_id = grupo_id;
        this.grupo = grupo;
    }

    public int getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(int grupo_id) {
        this.grupo_id = grupo_id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
