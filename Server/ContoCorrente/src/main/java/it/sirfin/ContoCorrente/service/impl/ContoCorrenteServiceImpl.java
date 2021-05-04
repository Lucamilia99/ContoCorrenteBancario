package it.sirfin.ContoCorrente.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.sirfin.ContoCorrente.dto.ListaContoCorrenteDto;
import it.sirfin.ContoCorrente.model.ContoCorrente;
import it.sirfin.ContoCorrente.service.ContoCorrenteService;

@Service

public class ContoCorrenteServiceImpl implements ContoCorrenteService {

	List<ContoCorrente> conto = new ArrayList<>();

	@Override
	public ListaContoCorrenteDto aggiungi(ContoCorrente cc) {
		cc.setImportoEuro(cc.getImportoEuro() * 1.20);
		cc.setImportoDollari(cc.getImportoDollari() * 0.83);
		conto.add(cc);
		for (ContoCorrente cc1 : conto) {
			System.out.println(cc1);
		}
		return new ListaContoCorrenteDto(conto);
	}

	@Override
	public ListaContoCorrenteDto elimina(ContoCorrente cc) {
		conto.remove(cc.getId());
		return new ListaContoCorrenteDto(conto);
	}

}
