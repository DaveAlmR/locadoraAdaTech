package br.locadora.Rest;

import br.locadora.Domain.Interfaces.IBaseLocadoraModel;
import br.locadora.Services.IService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public abstract class AbstractGenericCRUDRest<T extends IBaseLocadoraModel, S extends IService> {

    @Inject
    S service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response persist(T dado) {
        try {
            System.out.println(service);
            return Response
                    .status(Response.Status.OK)
                    .entity(service.persist(dado))
                    .build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(final @PathParam("id") int id) {
        try {
            return Response
                    .status(Response.Status.OK)
                    .entity(service.find(id))
                    .build();
        } catch (Exception e) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN_TYPE)
                    .build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(final @PathParam("id") int id) {
        try {
            service.remove(id);

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
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(final @PathParam("id") int id, T dado) {
        try {
            service.update(dado, id);

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
                    .entity(service.getAll())
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
