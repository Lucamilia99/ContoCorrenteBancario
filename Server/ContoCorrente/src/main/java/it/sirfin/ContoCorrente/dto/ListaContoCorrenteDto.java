package it.sirfin.ContoCorrente.dto;

import java.util.ArrayList;
import java.util.List;

import it.sirfin.ContoCorrente.model.ContoCorrente;

public class ListaContoCorrenteDto {
	List<ContoCorrente> contiCorrente;

	public ListaContoCorrenteDto() {
		super();
	}

	public List<ContoCorrente> getContiCorrente() {
		if (contiCorrente == null) {
			contiCorrente = new ArrayList<>();
		}
		return contiCorrente;
	}

	public void setContiCorrente(List<ContoCorrente> contiCorrente) {
		if (contiCorrente == null) {
			contiCorrente = new ArrayList<>();
		}
		this.contiCorrente = contiCorrente;
	}

	public ListaContoCorrenteDto(List<ContoCorrente> contiCorrente) {
		super();
		this.contiCorrente = contiCorrente;
	}

	@Override
	public String toString() {
		return "ListaContoCorrente [contiCorrente=" + contiCorrente + "]";
	}

}
