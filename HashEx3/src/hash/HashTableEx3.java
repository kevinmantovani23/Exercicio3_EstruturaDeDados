package hash;

public class HashTableEx3 {

	Hash_Ex3[] tabela;
	static int TAM_MAX = 26;
	int pos;
	int indice;

	public HashTableEx3() {
		tabela = new Hash_Ex3[TAM_MAX];
		char letra = 'A';
		for (int i = 0; i < TAM_MAX; i++) {
			tabela[i] = new Hash_Ex3();
			tabela[i].letra = Character.toString(letra);
			letra++;
		}
	}

	public void inserir(String objeto) {
		String caract = Character.toString(objeto.charAt(0)).toUpperCase();
		for (int i = 0; i < TAM_MAX; i++) {
			if (caract.equals(tabela[i].letra)) {
				if (tabela[i].item.contains(objeto)) {
					System.out.println("O item já existe.");
				} else {
					tabela[i].item.add(objeto);
					System.out.println("Item inserido na Hash[" + i + "]: " + tabela[i].letra);
				}
			}
		}
	}

	public void buscaNome(String nome) {
		String caract = Character.toString(nome.charAt(0)).toUpperCase();
		for (int i = 0; i < TAM_MAX; i++) {
			if (caract.equals(tabela[i].letra)) {
				indice = tabela[i].item.indexOf(nome);
				if (indice >= 0) {
					System.out.println(
							"Item encontrado na Hash[" + i + "]: " + tabela[i].letra + ", indice da lista: " + indice);

				} else {
					System.out.println("Item não encontrado.");

				}

			}
		}
	}

	public void apagarNome(String nome) {

		String caract = Character.toString(nome.charAt(0)).toUpperCase();
		for (int i = 0; i < TAM_MAX; i++) {
			if (caract.equals(tabela[i].letra)) {
				if (tabela[i].item.contains(nome)) {
					tabela[i].item.remove(nome);
					System.out.println("Item removido.");

				} else {
					System.out.println("Item não encontrado.");

				}

			}

		}
	}
	
	public void printar() {
		for (int i = 0; i < TAM_MAX; i++) {
			System.out.println("Hash ["+i+"]: " + tabela[i].letra + ":");
			System.out.println(tabela[i].item.toString());
		}
	}
}
