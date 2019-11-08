package com.jorgemussato.algafood.domain.service;

import com.jorgemussato.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.jorgemussato.algafood.domain.model.Cozinha;
import com.jorgemussato.algafood.domain.model.Restaurante;
import com.jorgemussato.algafood.domain.repository.CozinhaRepository;
import com.jorgemussato.algafood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class CadastroRestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public Restaurante salvar(Restaurante restaurante) {
        Long cozinhaId = restaurante.getCozinha().getId();
        Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);

        if (isNull(cozinha)) {
            throw new EntidadeNaoEncontradaException("Não existe cozinha cadastrada com código" + cozinhaId);
        }

        return restauranteRepository.salvar(restaurante);
    }


}
