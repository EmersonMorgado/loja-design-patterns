package br.com.emersonmorgado.loja.imposto;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
