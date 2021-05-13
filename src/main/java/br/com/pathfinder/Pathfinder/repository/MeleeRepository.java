package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Melee;

public interface MeleeRepository extends JpaRepository<Melee, Long>{
	Melee findById(long id);

}
