package br.locadora.Rest.Clientes;

import br.locadora.Domain.Clientes.ClientePF;
import br.locadora.Domain.Clientes.ClientePJ;
import br.locadora.Rest.AbstractGenericCRUDRest;
import br.locadora.Services.Clientes.ClientePFService;
import br.locadora.Services.Clientes.ClientePJService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/clientePessoaFisica")
public class ClientePFResource extends AbstractGenericCRUDRest<ClientePF, ClientePFService> {

}