package br.com.usina.api_pi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "monitoramento")
public class Monitoramento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Monitoramento() {}

    public Monitoramento(Long id) {
        setId(id);
    }
}
