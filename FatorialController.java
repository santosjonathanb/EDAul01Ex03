package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
		public int fatorial(int n, int i, int x) {
			if (i != x) { //condi��o de parada contador i diferente/menor que o valor insrido para o calculo fatorial
				n = n * i;
				i++;
				return fatorial(n, i, x); //chamada da proxima fun��o atualizando o valor n (fatorial) e valor i (valor a ser multiplicado)
			} else {
				return n;
			}
		}
	}


