package com.pokedex.facade;

import com.pokedex.model.Pokemon;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PokemonFacadeImpl implements PanacheRepository<Pokemon>, PokemonFacade{
    @Override
    public List<Pokemon> listarTodos() {
        return listAll();
    }

    @Override
    public Pokemon buscarId(Long id) {
        return null;
    }

    @Override
    public String salvar(Pokemon pokemon) {
        return null;
    }

    @Override
    public Pokemon editar(Pokemon pokemon) {
        return null;
    }

    @Override
    public String excluir(Long id) {
        return null;
    }
}
