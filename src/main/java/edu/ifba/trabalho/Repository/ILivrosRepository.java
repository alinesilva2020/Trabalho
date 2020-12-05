package edu.ifba.trabalho.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifba.trabalho.Model.Livros;

public interface ILivrosRepository extends JpaRepository<Livros, Integer> {

}
