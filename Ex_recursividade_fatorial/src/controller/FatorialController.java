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
	1 - A condi��o de parada � quando o decremento do n�mero incial � igual � 1;
	2 - O n�mero incial � decrementado e multiplicado. No caso da recursividade o mesmo princ�pio
	se aplica, o n�mero � multiplicado pela pr�pria fun��o, ao passo que � decrementado at� que a condi��o de
	parada seja satisfeita. o n�mero � decrementado at� chegar ao 1, pois se multiplicado por 0 ele se transforma
	em 0.  
*/