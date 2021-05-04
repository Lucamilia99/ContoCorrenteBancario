package it.sirfin.ContoCorrente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.sirfin.ContoCorrente.dto.ContoCorrenteDto;
import it.sirfin.ContoCorrente.dto.ListaContoCorrenteDto;
import it.sirfin.ContoCorrente.service.ContoCorrenteService;

@CrossOrigin("*") /*
					 * Consente tutte le origini, tutte le intestazioni ei metodi HTTP specificati
					 * nell'annotazione @RequestMapping.
					 */
@RestController // Specifica che è una classe che lavora con i servizi rest
public class ContoCorrenteController {

	@Autowired
	ContoCorrenteService contoCorrenteService;

	@RequestMapping("aggiungi")
	@ResponseBody
	public ListaContoCorrenteDto aggiungi(@RequestBody ContoCorrenteDto dto) {
		return contoCorrenteService.aggiungi(dto.getContoCorrente());
	}

	@RequestMapping("elimina")
	@ResponseBody
	public ListaContoCorrenteDto elimina(@RequestBody ContoCorrenteDto dto) {
		return contoCorrenteService.elimina(dto.getContoCorrente());
	}

}
