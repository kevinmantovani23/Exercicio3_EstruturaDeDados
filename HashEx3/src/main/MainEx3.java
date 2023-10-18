package main;

import javax.swing.JOptionPane;

import hash.HashTableEx3;

public class MainEx3 {

	public static void main(String[] args) {
		HashTableEx3 tabela = new HashTableEx3();
		int input = 1;
		String objeto;
		while (input > 0) {
			input = Integer.parseInt(JOptionPane.showInputDialog("1 - Acrescentar valores na tabela"
					+ "\n2 - Procurar um elemento da tabela"
					+ "\n3 - Excluir um elemento da tabela"
					+ "\n4 - Printar valores da tabela"
					+ "\n-1 - Sair"));
			
			switch(input) {
			case 1:
				objeto = JOptionPane.showInputDialog("Insira o nome.");
				tabela.inserir(objeto);
				break;
			case 2:
				objeto = JOptionPane.showInputDialog("Insira o nome.");
				tabela.buscaNome(objeto);
				break;
			case 3:
				objeto = JOptionPane.showInputDialog("Insira o nome.");
				tabela.apagarNome(objeto);
				break;
			case 4:
				tabela.printar();
				break;
			}
			
}

}
	}

