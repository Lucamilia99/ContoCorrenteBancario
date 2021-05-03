package it.sirfin.ContoCorrente.model;

import java.time.LocalDateTime;
//@Entity questa annotazione sarà presente solamente quando useremo un database e rappresenterò una tabella sul database 
public class ContoCorrente {
	// data : Date = undefined;
	// descrizione = "";
//	importoEuro = undefined;
//	importoDollari = undefined;
	private LocalDateTime data;
	private String Descrizione;
	private double importoEuro;
	private double importoDollari;

	
	
	public ContoCorrente() {
		
	}

	public ContoCorrente(LocalDateTime data, String descrizione, double importoEuro, double importoDollari) {
		this.data = data;
		Descrizione = descrizione;
		this.importoEuro = importoEuro;
		this.importoDollari = importoDollari;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data; 
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public double getImportoEuro() {
		return importoEuro;
	}

	public void setImportoEuro(double importoEuro) {
		this.importoEuro = importoEuro;
	}

	public double getImportoDollari() {
		return importoDollari;
	}

	public void setImportoDollari(double importoDollari) {
		this.importoDollari = importoDollari;
	}

	@Override
	public String toString() {
		return "ContoCorrente [data=" + data + ", Descrizione=" + Descrizione + ", importoEuro=" + importoEuro
				+ ", importoDollari=" + importoDollari + "]";
	}

}
