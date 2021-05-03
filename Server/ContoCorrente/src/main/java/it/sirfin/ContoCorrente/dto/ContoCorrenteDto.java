package it.sirfin.ContoCorrente.dto;

import it.sirfin.ContoCorrente.model.ContoCorrente;

public class ContoCorrenteDto {
	private ContoCorrente contoCorrente;

	public ContoCorrenteDto() {
		super();
	}

	public ContoCorrenteDto(ContoCorrente contoCorrente) {
		super();
		this.contoCorrente = contoCorrente;
	}

	public ContoCorrente getContoCorrente() {
		return contoCorrente;
	}

	public void setContoCorrente(ContoCorrente contoCorrente) {
		this.contoCorrente = contoCorrente;
	}

	@Override
	public String toString() {
		return "ContoCorrenteDto [contoCorrente=" + contoCorrente + "]";
	}
	 

}
