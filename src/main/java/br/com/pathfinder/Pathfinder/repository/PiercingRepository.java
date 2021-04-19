package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Piercing;

public interface PiercingRepository extends JpaRepository<Piercing, Long>{
	
	Piercing findById(long id);

}
