package br.com.usina.api_pi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "status_operacional")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descricao;

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status() {}

    public Status(Long id, String descricao) {
        setId(id);
        setDescricao(descricao);
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
