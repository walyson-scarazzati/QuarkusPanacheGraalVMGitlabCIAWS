package curso.projeto;

import jakarta.persistence.Entity;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Categoria extends PanacheEntity{

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
