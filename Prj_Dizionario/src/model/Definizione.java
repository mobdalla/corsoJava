package model;

public class Definizione {

	private int id;
	private String Vocabolo;
	private String Traduzione;
	private String fraseInglese;
	private String TraduzioneItaliano;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVocabolo() {
		return Vocabolo;
	}
	public void setVocabolo(String vocabolo) {
		Vocabolo = vocabolo;
	}
	public String getTraduzione() {
		return Traduzione;
	}
	public void setTraduzione(String traduzione) {
		Traduzione = traduzione;
	}
	public String getFraseInglese() {
		return fraseInglese;
	}
	public void setFraseInglese(String fraseInglese) {
		this.fraseInglese = fraseInglese;
	}
	public String getTraduzioneItaliano() {
		return TraduzioneItaliano;
	}
	public void setTraduzioneItaliano(String traduzioneItaliano) {
		TraduzioneItaliano = traduzioneItaliano;
	}
	
}
