package com.jorgemussato.algafood.jpa;

import com.jorgemussato.algafood.AlgafoodApplication;
import com.jorgemussato.algafood.domain.model.Cozinha;
import com.jorgemussato.algafood.domain.model.Restaurante;
import com.jorgemussato.algafood.domain.repository.CozinhaRepository;
import com.jorgemussato.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        Cozinha cozinha1 = new Cozinha();
//        Cozinha cozinha2 = new Cozinha();
//        cozinha1.setNome("Brasileira");
//        cozinha2.setNome("Japonesa");
//
//        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
//
//        cozinha1 = cozinhaRepository.salvar(cozinha1);
//        cozinhaRepository.salvar(cozinha2);
//
//        System.out.println(cozinha1.getId());
//        System.out.println(cozinha1.getNome());
//
//        List<Cozinha> cozinhas = cozinhaRepository.listar();
//
//        cozinhas.forEach(v -> System.out.println(v.getNome()));
//
//        System.out.println(cozinhaRepository.buscar(3L).getNome());
//
//        Cozinha cozinhaUpdate = new Cozinha();
//        cozinhaUpdate.setId(1L);
//        cozinhaUpdate.setNome("Italiana");
//        cozinhaRepository.salvar(cozinhaUpdate);
//
//
//        Cozinha cozinhaExcluir = new Cozinha();
//        cozinhaExcluir.setId(2L);
//        cozinhaRepository.remover(cozinhaExcluir);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

        List<Restaurante> restaurantes = restauranteRepository.listar();

        restaurantes.forEach(v -> {
            System.out.println(v.getNome());
            System.out.println(v.getCozinha().getNome());
        });

    }

}
