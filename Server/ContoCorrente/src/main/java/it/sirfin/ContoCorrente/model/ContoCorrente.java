package it.sirfin.ContoCorrente.model;

import java.time.LocalDate;

//@Entity questa annotazione sarà presente solamente quando useremo un database e rappresenterò una tabella sul database 
public class ContoCorrente {
	private int id;
	private LocalDate data;
	private String Descrizione;
	private double importoEuro;
	private double importoDollari;

	public ContoCorrente() {

	}

	public ContoCorrente(int id, LocalDate data, String descrizione, double importoEuro, double importoDollari) {
		this.id = id;
		this.data = data;
		Descrizione = descrizione;
		this.importoEuro = importoEuro;
		this.importoDollari = importoDollari;
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
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
		return "ContoCorrente [id=" + id + ", data=" + data + ", Descrizione=" + Descrizione + ", importoEuro="
				+ importoEuro + ", importoDollari=" + importoDollari + "]";
	}

	

}
