package it.sirfin.ContoCorrente.dto;

import java.util.List;

import it.sirfin.ContoCorrente.model.ContoCorrente;

public class ListaContoCorrente {
	List<ContoCorrente>contiCorrente;

	public ListaContoCorrente() {
		super();
	}

	public List<ContoCorrente> getContiCorrente() {
		return contiCorrente;
	}

	public void setContiCorrente(List<ContoCorrente> contiCorrente) {
		this.contiCorrente = contiCorrente;
	}

	public ListaContoCorrente(List<ContoCorrente> contiCorrente) {
		super();
		this.contiCorrente = contiCorrente;
	}

	@Override
	public String toString() {
		return "ListaContoCorrente [contiCorrente=" + contiCorrente + "]";
	}
	
	 

}
