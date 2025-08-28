package curso.projeto;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/categorias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoriaResource {
	
	@Inject
	private CategoriaRepository categoriaRepository;

    @GET
    public List<Categoria> listarCategorias() {
		return categoriaRepository.listAll();
    }
    
    @POST
    @Transactional
    public Categoria salvarCategoria(Categoria categoria) {
		categoria.persist();
		return categoria;
	}
}
