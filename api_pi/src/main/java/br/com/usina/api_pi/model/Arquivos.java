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
    private Long id_usuarios;
    private String nome;
    private String descricao;
    private byte[] arquivo;

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_usuarios(Long id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }

    public Arquivos() {}

    public Arquivos(Long id, Long id_usuarios, String nome, String descricao, byte[] arquivo) {
        setId(id);
        setId_usuarios(id_usuarios);
        setNome(nome);
        setDescricao(descricao);
        setArquivo(arquivo);
    }

    public Long getId() {
        return id;
    }

    public Long getId_usuarios() {
        return id_usuarios;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public byte[] getArquivo() {
        return arquivo;
    }
}
