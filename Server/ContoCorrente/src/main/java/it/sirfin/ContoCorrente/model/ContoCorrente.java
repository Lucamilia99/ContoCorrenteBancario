package it.sirfin.ContoCorrente.model;

import java.time.LocalDate;

//@Entity questa annotazione sarà presente solamente quando useremo un database e rappresenterò una tabella sul database 
public class ContoCorrente {
	private LocalDate data;
	private String Descrizione;
	private double importoEuro;
	private double importoDollari;

	public ContoCorrente() {

	}

	public ContoCorrente(LocalDate data, String descrizione, double importoEuro, double importoDollari) {
		this.data = data;
		Descrizione = descrizione;
		this.importoEuro = importoEuro;
		this.importoDollari = importoDollari;
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
		return "ContoCorrente [data=" + data + ", Descrizione=" + Descrizione + ", importoEuro=" + importoEuro
				+ ", importoDollari=" + importoDollari + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descrizione == null) ? 0 : Descrizione.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		long temp;
		temp = Double.doubleToLongBits(importoDollari);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(importoEuro);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContoCorrente other = (ContoCorrente) obj;
		if (Descrizione == null) {
			if (other.Descrizione != null)
				return false;
		} else if (!Descrizione.equals(other.Descrizione))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (Double.doubleToLongBits(importoDollari) != Double.doubleToLongBits(other.importoDollari))
			return false;
		if (Double.doubleToLongBits(importoEuro) != Double.doubleToLongBits(other.importoEuro))
			return false;
		return true;
	}



}
