
public class iteracao_While {

	public static void main(String[] args) {

//		int i = 0;
//		while (i < 5) {
//			System.out.println("um texto");
//			i++;
//		}
		
//		int i = 0;
//		while (i < 10) {
//			if (i == 8){
//				System.out.println("para a iteração");
//				break;
//			}
//			System.out.println("um texto");
//			i++;
//		}
		
		int i = 0;
		while (i < 10) {
			if (i == 8){
				System.out.println("Salta a iteração");
				i++; // é necessário colocar o i para efetuar a fuga do if. Evita loop infinito
				continue;
			}
			System.out.println("um texto" + i);
			i++;
		}

	}

}
