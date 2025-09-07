package curso.projeto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Categoria extends PanacheEntity{

    @NotEmpty
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Categoria> listarCategorias() {
		return listAll();
	}
}
