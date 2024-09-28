package a_tiposVariaveis;
import java.util.Scanner;

public class constante {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	//O valor constante é referenciado por FINAL (que não pode ser alterado).
	//Não deixe numeros soltos no meio do algoritimo, pois pode ser dificil à manutenção
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//final Integer idadeMinimaParaTirarCarteira = 18; 
		//Uma constante também pode ser declarada no meio do algoritimo. Porém é mais usual, declarar como constante statica
												   	 	 
		System.out.print("Idade: ");
		Integer idade = sc.nextInt();

		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim, ele pode tirar carteira");
		}else{
			System.out.println("Não, ele não pode tirar carteira");
		}; 
		
		sc.close();


	}

}
