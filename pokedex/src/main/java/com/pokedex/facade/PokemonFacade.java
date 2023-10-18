package com.pokedex.facade;

import com.pokedex.model.Pokemon;

import java.util.List;

public interface PokemonFacade {

    List<Pokemon> listarTodos();

    Pokemon buscarId(Long id);

    String salvar(Pokemon pokemon);

    Pokemon editar(Pokemon pokemon);
    String excluir(Long id);
}
