package br.locadora.Rest;

import br.locadora.DTO.AluguelDTO;
import br.locadora.Services.AluguelService;
import br.locadora.Services.Clientes.ClientePFService;
import br.locadora.Services.Clientes.ClientePJService;
import br.locadora.Services.Veiculos.CaminhaoService;
import br.locadora.Services.Veiculos.CarroService;
import br.locadora.Services.Veiculos.MotoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/aluguel")
public class AluguelResource {

    @Inject
    AluguelService aluguelService;

    @Inject
    CarroService carroService;

    @Inject
    MotoService motoService;

    @Inject
    CaminhaoService caminhaoService;

    @Inject
    ClientePFService clientePFService;

    @Inject
    ClientePJService clientePJService;

    @POST
    @Path("/PF/carro")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alugaPFCarro(AluguelDTO aluguel) {
        try {
            aluguelService.aluga(aluguel, carroService, clientePFService);
            return Response
                    .status(Response.Status.OK)
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @POST
    @Path("/PF/moto")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alugaPFMoto(AluguelDTO aluguel) {
        try {
            aluguelService.aluga(aluguel, motoService, clientePFService);
            return Response
                    .status(Response.Status.OK)
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @POST
    @Path("/PF/caminhao")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alugaPFCaminhao(AluguelDTO aluguel) {
        try {
            aluguelService.aluga(aluguel, caminhaoService, clientePFService);
            return Response
                    .status(Response.Status.OK)
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @POST
    @Path("/PJ/carro")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alugaPJCarro(AluguelDTO aluguel) {
        try {
            aluguelService.aluga(aluguel, carroService, clientePJService);
            return Response
                    .status(Response.Status.OK)
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @POST
    @Path("/PJ/moto")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alugaPJMoto(AluguelDTO aluguel) {
        try {
            aluguelService.aluga(aluguel, motoService, clientePJService);
            return Response
                    .status(Response.Status.OK)
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @POST
    @Path("/PJ/caminhao")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alugaPJCaminhao(AluguelDTO aluguel) {
        try {
            aluguelService.aluga(aluguel, caminhaoService, clientePJService);
            return Response
                    .status(Response.Status.OK)
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        try {
            return Response
                    .status(Response.Status.OK)
                    .entity(aluguelService.getAll())
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }
}