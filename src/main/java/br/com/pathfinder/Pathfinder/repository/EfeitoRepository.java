package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Efeito;

public interface EfeitoRepository extends JpaRepository<Efeito, Long>{
	Efeito findById(long id);
}
