package br.locadora.Rest;

import br.locadora.Services.PagamentoService;
import br.locadora.Services.Pagamentos.CreditoService;
import br.locadora.Services.Pagamentos.DinheiroService;
import br.locadora.Services.Pagamentos.PIXService;
import br.locadora.Domain.Pagamentos.Credito;
import br.locadora.Domain.Pagamentos.Dinheiro;
import br.locadora.Domain.Pagamentos.PIX;

import javax.inject.Inject;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pagar")
public class PagamentoResource {

    @Inject
    PagamentoService pagamentoService;

    @Inject
    CreditoService creditoService;

    @Inject
    DinheiroService dinheiroService;

    @Inject
    PIXService pixService;

    @PUT
    @Path("credito/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateCredito(final @PathParam("id") int id, Credito credito) {
        try {
            pagamentoService.pagar(creditoService, id, credito);

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

    @PUT
    @Path("dinheiro/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateDinheiro(final @PathParam("id") int id, Dinheiro dinheiro) {
        try {
            pagamentoService.pagar(dinheiroService, id, dinheiro);

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

    @PUT
    @Path("PIX/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateDinheiro(final @PathParam("id") int id, PIX pix) {
        try {
            pagamentoService.pagar(pixService, id, pix);

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
}
