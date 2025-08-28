package curso.projeto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/outroHello")
    public Categoria outroHello() {
        Categoria categoria = new Categoria();
        categoria.setNome("Nome da Categoria");
        return categoria;
    }
}
