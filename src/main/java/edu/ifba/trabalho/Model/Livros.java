package edu.ifba.trabalho.Model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
		
		
		@DateTimeFormat(pattern = "dd/MM/yyyy")
		private Date cadastro;
		// ver o tipo do date de registro para combinar com o sql
		//saber se todas as colunas sao neme por padrao de varchar
		
		
}
	
