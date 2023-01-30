package br.locadora.Rest.Veiculos;

import br.locadora.Domain.Veiculos.Caminhao;
import br.locadora.Domain.Veiculos.Moto;
import br.locadora.Rest.AbstractGenericCRUDRest;
import br.locadora.Services.Veiculos.CaminhaoService;
import br.locadora.Services.Veiculos.MotoService;

import javax.ws.rs.Path;

@Path("/caminhao")
public class CaminhaoResource extends AbstractGenericCRUDRest<Caminhao, CaminhaoService> {

}
