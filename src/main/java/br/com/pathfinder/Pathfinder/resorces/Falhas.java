package br.com.pathfinder.Pathfinder.resorces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pathfinder.Pathfinder.models.Bludgeoning;
import br.com.pathfinder.Pathfinder.models.Melee;
import br.com.pathfinder.Pathfinder.repository.MeleeRepository;
import br.com.pathfinder.Pathfinder.repository.RangedRepository;
import br.com.pathfinder.Pathfinder.repository.SpellRepository;
import br.com.pathfinder.Pathfinder.repository.UnarmedRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST PathFinder")
public class Falhas {
	
	@Autowired
	MeleeRepository meleeRepository;
	@Autowired
	RangedRepository rangedRepository;
	@Autowired
	UnarmedRepository unarmedRepository;
	@Autowired
	SpellRepository spellRepository;
	
	@ApiOperation(value="Retorna uma falha Melee")
	@GetMapping("/melee/{id}")
	public Melee melee(@PathVariable(value="id") long id){
		return meleeRepository.findById(id);
	}

}
