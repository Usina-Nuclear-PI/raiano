package br.com.usina.api_pi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arquivos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Arquivos() {}

    public Arquivos(Long id) {
        setId(id);
    }

    public Long getId() {
        return id;
    }
}
