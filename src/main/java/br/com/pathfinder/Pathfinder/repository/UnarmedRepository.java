package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Unarmed;

public interface UnarmedRepository extends JpaRepository<Unarmed, Long>{
	Unarmed findById(long id);

}
