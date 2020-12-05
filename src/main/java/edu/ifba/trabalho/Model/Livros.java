package edu.ifba.trabalho.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

	@Entity
	@Table(name="Livros")
	@Getter
	@Setter
	public class Livros {
		@Id
		@GeneratedValue(strategy =  GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name= "titulo")
		private String titulo;
		
		@Column(name= "descricao")
		private String descricao;
		
		@Column(name= "referencia")
		private String referencia;
		
		@Column(name= "cadastro")
		private String cadastro;
		// ver o tipo do date de registro
		
		
}
	
