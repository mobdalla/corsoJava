package model;

import java.util.Date;

public class Todo {
	private int id;
	private String descrizione;
	private Date data;
	private boolean done;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Todo [id=");
		builder.append(id);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", data=");
		builder.append(data);
		builder.append(", done=");
		builder.append(done);
		builder.append("]");
		return builder.toString();
	}
	
	
}
