package com.jorgemussato.algafood.api.controller;

import com.jorgemussato.algafood.domain.exception.EntidadeEmUsoException;
import com.jorgemussato.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.jorgemussato.algafood.domain.model.Cozinha;
import com.jorgemussato.algafood.domain.repository.CozinhaRepository;
import com.jorgemussato.algafood.domain.service.CadastroCozinhaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @Autowired
    private CadastroCozinhaService cadastroCozinhaService;

    @GetMapping
    public List<Cozinha> listar() {
        return cozinhaRepository.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cozinha> buscar(@PathVariable Long id) {
        Cozinha cozinha =  cozinhaRepository.buscar(id);
        if (!isNull(cozinha)) {
            return ResponseEntity.ok(cozinha);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cozinha adicionar(@RequestBody Cozinha cozinha) {
        return cadastroCozinhaService.salvar(cozinha);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cozinha> atualizar(@PathVariable Long id, @RequestBody Cozinha cozinha) {
        Cozinha cozinhaEncontrada = cozinhaRepository.buscar(id);
        if (!isNull(cozinhaEncontrada)) {
            BeanUtils.copyProperties(cozinha, cozinhaEncontrada, "id");
        } else {
            return ResponseEntity.notFound().build();
        }
        cadastroCozinhaService.salvar(cozinhaEncontrada);
        return ResponseEntity.ok(cozinhaEncontrada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cozinha> remover(@PathVariable Long id) {
        try {
            cadastroCozinhaService.excluir(id);
            return ResponseEntity.noContent().build();
        } catch (EntidadeEmUsoException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
