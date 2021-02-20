package br.com.emersonmorgado.loja.desconto;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class CalculadoraDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoOrcamentoComMaisDeCincoItens(
				new DescontoOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}
}
