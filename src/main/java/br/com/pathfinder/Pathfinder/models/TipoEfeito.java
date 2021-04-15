package br.com.pathfinder.Pathfinder.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TIPO_EFEITO")
public class TipoEfeito implements Serializable{
	
	private static final long serialVersionUID = 1L;
			
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	private String descricao;
	private long id_efeito;
	private String titulo;
	private String tipo_efeito;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getId_efeito() {
		return id_efeito;
	}
	public void setId_efeito(long id_efeito) {
		this.id_efeito = id_efeito;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo_efeito() {
		return tipo_efeito;
	}
	public void setTipo_efeito(String tipo_efeito) {
		this.tipo_efeito = tipo_efeito;
	}
	
	
	
}