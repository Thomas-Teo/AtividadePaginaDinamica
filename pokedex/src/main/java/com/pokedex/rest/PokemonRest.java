package com.pokedex.rest;

import com.pokedex.facade.PokemonFacade;
import com.pokedex.model.Pokemon;
import io.smallrye.common.annotation.RunOnVirtualThread;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.transaction.Transactional;
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
    public List<Pokemon> listarTodos() throws Exception {
        return pokFac.listarTodos();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/id/{id}")
    public Pokemon buscarPokemon(@PathParam("id") Long id) throws Exception {
        return pokFac.buscarId(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/nome/{nome}")
    public Pokemon buscarPokemonNome(@PathParam("nome") String nome) throws Exception {
        return pokFac.buscarNome(nome);
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/novo")
    public String adicionarPokemon(@RequestBody Pokemon pokemon) throws Exception {
        return pokFac.salvar(pokemon);
    }

    @PUT
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Pokemon editarPokemon(@RequestBody Pokemon pokemon) throws Exception {
        return pokFac.editar(pokemon);
    }

    @DELETE
    @Transactional
    @Path("/id/{id}")
    public String excluir(@PathParam("id") Long id) throws Exception {
        return pokFac.excluir(id);
    }
}
