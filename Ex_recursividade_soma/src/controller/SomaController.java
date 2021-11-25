package controller;

public class SomaController {

	public SomaController() {
		super();
	}

	public int soma(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return numero + soma(numero - 1);
		}
	}
}
