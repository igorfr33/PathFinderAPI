package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Slashing;

public interface SlashingRepository extends JpaRepository<Slashing, Long>{
	
	Slashing findById(long id);

}
