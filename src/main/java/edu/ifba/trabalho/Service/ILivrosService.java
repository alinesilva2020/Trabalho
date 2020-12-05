package edu.ifba.trabalho.Service;

import java.util.List;

import edu.ifba.trabalho.Model.Livros;

public interface ILivrosService {
	
	void save(Livros l);
	void delete(Integer id);
	Livros find(Integer id);
	List<Livros> findAll();

}
