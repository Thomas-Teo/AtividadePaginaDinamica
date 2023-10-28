package com.pokedex.facade;

import com.pokedex.model.Pokemon;

import java.util.List;

public interface PokemonFacade {

    List<Pokemon> listarTodos() throws Exception;

    Pokemon buscarId(Long id)throws Exception;
    Pokemon buscarNome(String nome) throws Exception;

    String salvar(Pokemon pokemon)throws Exception;

    Pokemon editar(Pokemon pokemon)throws Exception;
    String excluir(Long id)throws Exception;
}
