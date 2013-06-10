package de.notenrechner;

public class Note {
	
	String fach, datum;
	Double note;
	
	public String getFach() {
		return fach;
	}
	public void setFach(String fach) {
		this.fach = fach;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}
	
	
	
	@Override
	public String toString() {
		
		return getFach()+" "+getDatum()+" "+getNote();
	}
	
	

}
