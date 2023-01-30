package br.locadora.Rest.Veiculos;

import br.locadora.Domain.Clientes.ClientePF;
import br.locadora.Domain.Clientes.ClientePJ;
import br.locadora.Domain.Veiculos.Carro;
import br.locadora.Rest.AbstractGenericCRUDRest;
import br.locadora.Services.Clientes.ClientePFService;
import br.locadora.Services.Clientes.ClientePJService;
import br.locadora.Services.Veiculos.CarroService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/carro")
public class CarroResource extends AbstractGenericCRUDRest<Carro, CarroService> {

}
