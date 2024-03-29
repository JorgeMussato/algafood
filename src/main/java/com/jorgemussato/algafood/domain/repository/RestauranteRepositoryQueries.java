package com.jorgemussato.algafood.domain.repository;

import com.jorgemussato.algafood.domain.model.Restaurante;

import java.math.BigDecimal;
import java.util.List;

public interface RestauranteRepositoryQueries {

    public List<Restaurante> find(String nome, BigDecimal taxaInicial, BigDecimal taxaFinal);

    public List<Restaurante> findComFreteGratisByNomeLike(String nome);

}
