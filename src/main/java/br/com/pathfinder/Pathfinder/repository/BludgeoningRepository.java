package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Bludgeoning;

public interface BludgeoningRepository extends JpaRepository<Bludgeoning, Long>{
	Bludgeoning findById(long id);
}
