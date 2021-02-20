package br.com.emersonmorgado.loja.imposto;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class PIS implements Imposto {
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.0165"));
	}
}
