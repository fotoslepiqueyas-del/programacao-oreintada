package br.eclipse.cps.fatec.barueri.dmd.gustavo;


public class gato {
	
	static String VARIAVEL_GATO = "1";
	
	String nome; 
	int quantidadePatas;
	String cor;
	
	public gato() {
		
	}
	
	public gato(String n, int qtePatas, String c){
	nome = n;
	quantidadePatas = qtePatas;
	cor = c;
	
}
	public void miar() {
		System.out.println(nome + "Miauuu");
		
	}
}