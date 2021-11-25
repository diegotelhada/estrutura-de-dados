package view;

import controller.RecursividadeOcorrencias;

public class Principal {

	public static void main(String[] args) {
		RecursividadeOcorrencias rec = new RecursividadeOcorrencias();
		int numero = 5341212;
		int comparador = 2;
		
		int ocorrencias = rec.ocorrencias(numero, comparador);
		System.out.println("Numero de ocorrências do número " + comparador + " no número " + numero + ": " + ocorrencias);

	}

}
