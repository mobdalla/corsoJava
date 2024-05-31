package cani;

public class CaneGrande extends Cane { //CaneGrande e un parte di cane

	public String ciboSpeciale; //string public
	
	public CaneGrande(String nome,  String razza, int eta) {
		super(nome, "grande", razza, eta);
		// TODO Auto-generated constructor stub
		this.ciboSpeciale= "scatolette giganti";           
	}
	
	@Override  
	public void mangia (int num) {
		System.out.println(ciboSpeciale+ " " + num);
		System.out.println("munch munch");
	}
}
