package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.BombOrSpell;

public interface BombOrSpellRepository extends JpaRepository<BombOrSpell, Long>{
	
	BombOrSpell findById(long id);

}
