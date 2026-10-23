package br.com.usina.api_pi.controller;

import br.com.usina.api_pi.model.Usuarios;
import br.com.usina.api_pi.repository.UsuariosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private UsuariosRepository repository;

    public UsuariosController(UsuariosRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Usuarios> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Usuarios criar(@RequestBody Usuarios usuario) {
        return  repository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuarios atualizar(@PathVariable Long id, @RequestBody Usuarios usuario) {
        usuario.setId(id);
        return repository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Usuarios buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}