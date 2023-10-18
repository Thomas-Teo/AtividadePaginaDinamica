package com.pokedex.rest;

import com.pokedex.facade.PokemonFacade;
import com.pokedex.model.Pokemon;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/pokemon")
public class PokemonRest {

    private final PokemonFacade pokFac;

    @Inject
    public PokemonRest(PokemonFacade pokFac) {
        this.pokFac = pokFac;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pokemon> listarTodos() {
        return pokFac.listarTodos();
    }
}
