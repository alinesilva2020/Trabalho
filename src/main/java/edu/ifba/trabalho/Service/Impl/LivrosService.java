package edu.ifba.trabalho.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.ifba.trabalho.Model.Livros;
import edu.ifba.trabalho.Repository.ILivrosRepository;
import edu.ifba.trabalho.Service.ILivrosService;
@Service

public class LivrosService implements ILivrosService{

	@Autowired
	private ILivrosRepository repository;
	
	@Override
	public void save(Livros l) {
		// TODO Auto-generated method stub
		repository.save(l);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Livros find(Integer id) {
		// TODO Auto-generated method stub
		Optional<Livros> livroEscolhido = repository.findById(id);
		return livroEscolhido.isPresent()? livroEscolhido.get(): null;
	}

	@Override
	public List<Livros> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll(Sort.by("titulo"));
	}

}
