package br.eclipse.cps.fatec.barueri.dmd.gustavo;

public class g1 {

	public static void main(String[] args) {

		gato g1 = new gato();

		gato g2 = new gato("nome", 3, "branco");

	
		System.out.println(g1.nome);
		g1.nome = "mutuca";
		System.out.println(g1.nome);
		g1.miar();
	}
}
