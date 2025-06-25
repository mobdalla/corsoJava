package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.DefCtrl;
import model.Definizione;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		
		   URL url;
			url = new URL("https://raw.githubusercontent.com/maboglia/esercitazioni/refs/heads/main/Java/esercitazione-quiz-dizionario/dict-ita-eng.tsv");
			URLConnection flusso = url.openConnection();
			Scanner sc = new Scanner(new InputStreamReader(flusso.getInputStream()));
			
		while(sc.hasNextLine()) {
			String riga = sc.nextLine();
			String[] split = riga.split("\t");

			String traduzione = split[2];
			String vocablario = split[1];
			String fraseInglese = split[3];
			String fraseItaliano = split[4];
			
			DefCtrl contr = new DefCtrl();
			Definizione def  = new Definizione();
			int counter = 1;
			def.setId(counter ++);
			def.setVocabolo(vocablario);
			def.setTraduzione(traduzione);
			def.setFraseInglese(fraseInglese);
			def.setTraduzioneItaliano(traduzione);
			contr.add(def);
			
		}
		
	}

}
