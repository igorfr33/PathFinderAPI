package br.com.pathfinder.Pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pathfinder.Pathfinder.models.Spell;

public interface SpellRepository extends JpaRepository<Spell, Long>{
	Spell findById(long id);

}
