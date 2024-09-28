
public class ListaAlunos {

	static final int QUANTIDADE_LISTA = 2;

	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

	Integer tamanhoLista = 0; // tamanho inicial da lista

	Aluno obter(int indice) {
		return lista[indice];
	}

	int tamanho() {
		return tamanhoLista;
	}

	void adicionar(Aluno aluno) {
		// IF para aumentar o tamanho da lista caso já tenha chegado no limite definido
		if (tamanhoLista == lista.length) {
			Aluno[] novalista = new Aluno[QUANTIDADE_LISTA + lista.length];
			// for para capturar as informações da lista antiga
			for (int i = 0; i < lista.length; i++) {
				novalista[i] = lista[i];
			}
			lista = novalista;
		}
		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}

	void remover(Aluno aluno) {
		// encontrar o índice na lista
		for (int i = 0; i < tamanhoLista; i++) {
			Aluno a = lista[i];
			// if se tem valor diferente de nulo && se é igual o paramentro passado
			if (a != null && a.equals(aluno)) {
				// aqui remove o aluno da lista
				removerRetroceder(i);
				break;
			} else if (a == null && aluno == null) {
				removerRetroceder(i);
				break;
			}
		}
	}

	void removerRetroceder(int indice) {
		// remove o valor e retrocede a lista para não ficar com posições vazias
		int indiceInicial = indice + 1;

		for (int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i - 1] = lista[i];
		}
		tamanhoLista--;
		lista[tamanhoLista] = null; // limpando a ultima posição
	}

	void ordenar() {
		System.out.println("*******Início*******");
		for (int i = 0; i < tamanhoLista; i++) {
			System.out.println("<<Iniciando o FOR>>");
			Aluno alunoPosicaoBase = lista[i];
			System.out.println("Posição " + i + ": " + alunoPosicaoBase.nome);

			int indicePosicaoBase = i;
			while (indicePosicaoBase > 0) {
				System.out.println("<<Entrando no WHILE>>");
				int indicePosicaoAnterior = indicePosicaoBase - 1;
				Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				System.out.println("Posição anterior " + indicePosicaoAnterior + ": " + alunoPosicaoAnterior.nome);
				Boolean alunoPoiscaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null
						|| alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);
								
				if (alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase)) {
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];

					indicePosicaoBase--;
				} else {
					break;
				}
				System.out.println("<<Finalizando o WHILE>>");
			}
			lista[indicePosicaoBase] = alunoPosicaoBase;
			System.out.println("<<Finalizando o FOR>>");
			System.out.println("\n");
		}
		System.out.println("*******FIM*******");
	}

//	public static void main(String[] args) {
//		String nome1 = "Douglas";
//		String nome2 = "Douglas";
//		System.out.println(nome1.compareTo(nome2)); //retorna -1 0 1
//	}
}
