package com.pokedex.facade;

import com.pokedex.model.Pokemon;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PokemonFacadeImpl implements PanacheRepository<Pokemon>, PokemonFacade{
    @Override
    public List<Pokemon> listarTodos() throws Exception {
        List<Pokemon> listPokemon = new ArrayList<Pokemon>();
        try {
            listPokemon = listAll();
            return listPokemon;
        } catch (Exception e) {
            e.getCause().getMessage();
        }
        return null;
    }

    @Override
    public Pokemon buscarId(Long id)throws Exception {
        Pokemon pok = new Pokemon();
        try {
            pok = findById(id);
        } catch (Exception e) {
            e.getCause().getMessage();
        }
        return null;
    }

    @Override
    public Pokemon buscarNome(String nome) throws Exception {
        Pokemon pok = new Pokemon();
        try {
            pok = (Pokemon) find("nome = :nome", Parameters.with("nome", nome).map());
        } catch (Exception e) {
            e.getCause().getMessage();
        }
        return null;
    }

    @Override
    public String salvar(Pokemon pokemon)throws Exception {
        try {
            persistAndFlush(pokemon);
            return "Salvo com Sucesso";
        } catch (Exception e) {
            e.getCause().getMessage();
        }
        return "Não foi possivel salvar";
    }

    @Override
    public Pokemon editar(Pokemon pokemon)throws Exception {
        try {
            persistAndFlush(pokemon);
            return pokemon;
        } catch (Exception e) {
            e.getCause().getMessage();
        }
        return null;
    }

    @Override
    public String excluir(Long id) throws Exception{
        Pokemon pok = new Pokemon();
        try {
            pok = findById(id);
            delete(pok);
            return "Excluido com sucesso";
        } catch (Exception e) {
            e.getCause().getMessage();
        }
        return "Não foi possivel excluir";
    }
}
