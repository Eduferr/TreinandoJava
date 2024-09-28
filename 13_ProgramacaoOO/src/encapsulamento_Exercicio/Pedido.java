package encapsulamento_Exercicio;

public class Pedido {

	Integer codigo;
	Double subTotal;
	Double desconto;

	Double getTotal() {
		return subTotal - desconto;
	}
	
	void setTotal(Double total) {
		
	}

	Integer getCodigo() {
		return codigo;
	}

	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	Double getSubTotal() {
		return subTotal;
	}

	void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	Double getDesconto() {
		return desconto;
	}

	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

}
