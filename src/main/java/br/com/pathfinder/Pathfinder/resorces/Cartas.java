package br.com.pathfinder.Pathfinder.resorces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pathfinder.Pathfinder.models.Efeito;
import br.com.pathfinder.Pathfinder.models.TipoEfeito;
import br.com.pathfinder.Pathfinder.repository.EfeitoRepository;
import br.com.pathfinder.Pathfinder.repository.TipoEfeitoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST PathFinder")
public class Cartas {
	
	@Autowired
	EfeitoRepository efeitoRepository;
	@Autowired
	TipoEfeitoRepository tipoEfeitoRepository;
	
	@ApiOperation(value="Retorna um Efeito")
	@GetMapping("/efeitos/{id}")
	public Efeito listaEfeito(@PathVariable(value="id") long id){
		return efeitoRepository.findById(id);
	}
	
	@ApiOperation(value="Retorna um Tipo de Efeito")
	@GetMapping("/tipoefeito/{id_efeito}")
	public TipoEfeito listaTipoEfeito(@PathVariable(value="id_efeito") long id_efeito){
		return tipoEfeitoRepository.findById(id_efeito);
	}
	
}
