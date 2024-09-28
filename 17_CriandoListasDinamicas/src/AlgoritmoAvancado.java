
public class AlgoritmoAvancado {

	public static void main(String[] args) {

		ListaAlunos listaAlunos = new ListaAlunos();

		Aluno aluno1 = new Aluno();
		aluno1.nome = "Thiago";
		listaAlunos.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Pablo";
		listaAlunos.adicionar(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Carlos";
		listaAlunos.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Bolivar";
		listaAlunos.adicionar(aluno4);

		Aluno aluno5 = new Aluno();
		aluno5.nome = "Atos";
		listaAlunos.adicionar(aluno5);

//		System.out.println("lista completa");
//		iterar(listaAlunos);
		
		System.out.println("Lista Ordenada");
		listaAlunos.ordenar();
		iterar(listaAlunos);

//		System.out.println("lista com com nome removido");
//		listaAlunos.remover(aluno3);
//		iterar(listaAlunos);


	}

	static void iterar(ListaAlunos listaAlunos) {

		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
			} else {
				System.out.println("Aluno sem nome");
			}
		}
		System.out.println("--------------------");

	}

}
