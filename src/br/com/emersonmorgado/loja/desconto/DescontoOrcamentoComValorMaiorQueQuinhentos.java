package br.com.emersonmorgado.loja.desconto;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class DescontoOrcamentoComValorMaiorQueQuinhentos extends Desconto {
	
	public DescontoOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.5"));
		}
		return proximo.calcular(orcamento);
	}
}
