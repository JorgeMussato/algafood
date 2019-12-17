package com.jorgemussato.algafood.api.controller;

import com.jorgemussato.algafood.domain.model.Restaurante;
import com.jorgemussato.algafood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping("/restaurantes/por-nome-e-cozinha")
    public List<Restaurante> findByNomeAndCozinhaId(String nome, Long cozinhaId) {
        return restauranteRepository.consultarPorNome(nome, cozinhaId);
    }

    @GetMapping("/restaurantes/por-nome-e-frete")
    public List<Restaurante> findByNomeAndFreteBetween(String nome, BigDecimal freteInicial, BigDecimal freteFinal) {
        return restauranteRepository.find(nome, freteInicial, freteFinal);
    }

    @GetMapping("/restaurantes/com-frete-gratis")
    public List<Restaurante> findRestaurantesComFreteGratis(String nome) {
        return restauranteRepository.findComFreteGratisByNomeLike(nome);
    }

    @GetMapping("/restaurantes/primeiro")
    public Optional<Restaurante> findPrimeiroRestaurante() {
        return restauranteRepository.buscarPrimeiro();
    }

}
