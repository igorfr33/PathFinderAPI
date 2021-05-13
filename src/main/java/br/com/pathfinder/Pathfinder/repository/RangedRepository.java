package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Ranged;

public interface RangedRepository extends JpaRepository<Ranged, Long>{
	Ranged findById(long id);

}
