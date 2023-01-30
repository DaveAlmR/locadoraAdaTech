package br.locadora.Rest.Veiculos;

import br.locadora.Domain.Veiculos.Carro;
import br.locadora.Domain.Veiculos.Moto;
import br.locadora.Rest.AbstractGenericCRUDRest;
import br.locadora.Services.Veiculos.CarroService;
import br.locadora.Services.Veiculos.MotoService;

import javax.ws.rs.Path;

@Path("/moto")
public class MotoResource extends AbstractGenericCRUDRest<Moto, MotoService> {

}
