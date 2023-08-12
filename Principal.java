package view;

import javax.swing.JOptionPane;
import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro entre 1 e 12 para o cáculo do fatorial:"));
		int x = n;
		int i = 1;
		
		FatorialController fc = new FatorialController();
		int res = fc.fatorial(n, i, x);
		System.out.println(res);
	}
}
