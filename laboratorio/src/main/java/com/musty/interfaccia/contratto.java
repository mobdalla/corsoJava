package com.musty.interfaccia;
@FunctionalInterface //lambda posso usare solo con intefaccia 
public interface contratto {
	
	void regola1();
	
	static void mioMetodo() {
		System.out.println("funge");
	}
	default void mioMetodo2() {
		System.out.println("funge");
	}
}
