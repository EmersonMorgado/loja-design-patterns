package br.com.emersonmorgado.loja.desconto;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);
}
