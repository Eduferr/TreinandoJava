
public class Func_matematica {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		
		a = Math.sqrt(x); //retorna a raiz quadrada de um número
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);		
		System.out.println("Raiz quadrada de " + x + " = " + a);
		System.out.println("Raiz quadrada de " + y + " = " + b);
		System.out.println("Raiz quadrada de 25 = " + c + "\n");
		
		a = Math.pow(x, y); //x elevado a y
		b = Math.pow(x, 2.0); // x elevado ao quadrado
		c = Math.pow(5.0, 2.0);	// 5 elevado ao quadrado	
		System.out.println(x + " elevado a " + y + " = " + a);
		System.out.println(x + " elevado ao quadrado = " + b);
		System.out.println("5 elevado ao quadrado  = " + c + "\n");
		
		a = Math.abs(y); //retornar o valor absoluto de um número
		b = Math.abs(z);		
		System.out.println("Valor absoluto de " + y + " = " + a);
		System.out.println("Valor absoluto de " + z + " = " + b);
		
	//Usando na formula de bhaskara
		
		/*
		 * x = -b (+ ou -) raiz quadrada de delta (onde) delta = b ao quadrado - 4 x A x C
		 * 
		 * Delta = Math.pow(b, 2.0) - 4*a*c;
		 * 
		 * x1 = (-b + Math.sqrt(delta)) / (2.0 *a);	
		 * x2 = (-b - Math.sqrt(delta)) / (2.0 *a);
		 * */		
		
	}

}
