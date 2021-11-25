package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public int fat(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return numero * fat(numero - 1);
		}
	}
}

/*
	1 - A condição de parada é quando o decremento do número incial é igual à 1;
	2 - O número incial é decrementado e multiplicado. No caso da recursividade o mesmo princípio
	se aplica, o número é multiplicado pela própria função, ao passo que é decrementado até que a condição de
	parada seja satisfeita. o número é decrementado até chegar ao 1, pois se multiplicado por 0 ele se transforma
	em 0.  
*/