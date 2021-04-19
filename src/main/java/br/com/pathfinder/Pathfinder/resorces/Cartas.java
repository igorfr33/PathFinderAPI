package br.com.pathfinder.Pathfinder.resorces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pathfinder.Pathfinder.models.Bludgeoning;
import br.com.pathfinder.Pathfinder.models.BombOrSpell;
import br.com.pathfinder.Pathfinder.models.Piercing;
import br.com.pathfinder.Pathfinder.models.Slashing;
import br.com.pathfinder.Pathfinder.repository.BludgeoningRepository;
import br.com.pathfinder.Pathfinder.repository.BombOrSpellRepository;
import br.com.pathfinder.Pathfinder.repository.PiercingRepository;
import br.com.pathfinder.Pathfinder.repository.SlashingRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST PathFinder")
public class Cartas {
	
	@Autowired
	BludgeoningRepository bludgeoningRepository;
	@Autowired
	BombOrSpellRepository bombOrSpellRepository;
	@Autowired
	PiercingRepository piercingRepository;
	@Autowired
	SlashingRepository slashingRepository;
	
	@ApiOperation(value="Retorna um Bludgeoning")
	@GetMapping("/bludgeoning/{id}")
	public Bludgeoning bludgeoning(@PathVariable(value="id") long id){
		return bludgeoningRepository.findById(id);
	}
	
	@ApiOperation(value="Retorna um Bomb Or Spell")
	@GetMapping("/bomborspell/{id}")
	public BombOrSpell bombOrSpell(@PathVariable(value="id") long id){
		return bombOrSpellRepository.findById(id);
	}
	
	@ApiOperation(value="Retorna um Piercing")
	@GetMapping("/piercing/{id}")
	public Piercing piercing(@PathVariable(value="id")long id) {
		return piercingRepository.findById(id);
	}
	
	@ApiOperation(value="Retorna um Slashing")
	@GetMapping("/slashing/{id}")
	public Slashing slashing(@PathVariable(value="id") long id) {
		return slashingRepository.findById(id);
	}
	
}
