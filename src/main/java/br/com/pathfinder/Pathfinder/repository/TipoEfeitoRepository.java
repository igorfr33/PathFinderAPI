package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.TipoEfeito;

public interface TipoEfeitoRepository extends JpaRepository<TipoEfeito, Long>{
	
	TipoEfeito findById(long id);

}
