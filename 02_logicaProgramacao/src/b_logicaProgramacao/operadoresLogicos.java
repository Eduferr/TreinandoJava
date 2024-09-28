package b_logicaProgramacao;

public class operadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorque100 = false;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraAntes = true;
		
		//Condição "E"
		//Boolean aplicarDesconto = carrinhoMaiorque100 && periodoDePromocao;
	
		//Condição "Ou"
		//Boolean aplicarDesconto = carrinhoMaiorque100 || periodoDePromocao;
		
		//Boolean aplicarDesconto = carrinhoMaiorque100 && periodoDePromocao && jaFezCompraAntes;
		
		//Boolean aplicarDesconto = carrinhoMaiorque100 || periodoDePromocao || jaFezCompraAntes;
		
		Boolean aplicarDesconto = carrinhoMaiorque100 && (periodoDePromocao || jaFezCompraAntes);
		
		if (aplicarDesconto) {
			System.out.println("Aplique o desconto");
		}else {
			System.out.println("Não aplique o desconto");
		}

	}

}
