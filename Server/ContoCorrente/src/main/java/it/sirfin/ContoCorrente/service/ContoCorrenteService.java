package it.sirfin.ContoCorrente.service;

import org.springframework.web.bind.annotation.RequestBody;

import it.sirfin.ContoCorrente.dto.ListaContoCorrenteDto;
import it.sirfin.ContoCorrente.model.ContoCorrente;

public interface ContoCorrenteService {
	ListaContoCorrenteDto aggiungi(ContoCorrente cc);
	
	ListaContoCorrenteDto elimina(ContoCorrente cc);
	
	
}
