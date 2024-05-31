package cani;

public class Cane {
	
		String nome;
		String taglia;
		String razza;
		public int eta;
		
		public Cane(String nome, String taglia, String razza, int eta) {
			this.nome = nome;
			this.taglia = taglia;
			this.razza = razza;
			this.eta = eta;
			System.out.println("oggetto di tipo cane creato");
		}
		
		public void mangia(int num ) {
			System.out.printf("mangia %d crocchetine ", num);
			System.out.println("slap slap ");
		}

		public String stampCartellino() {
			
			String output = "Cane: \n" + 
							 nome + "\n"+
							 taglia + "\n"+
							 razza + "\n"+
							 eta + "\n";
			return output;
		}
		
}
