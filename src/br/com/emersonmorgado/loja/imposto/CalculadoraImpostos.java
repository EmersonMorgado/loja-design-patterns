package br.com.emersonmorgado.loja.imposto;

import java.math.BigDecimal;
import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class CalculadoraImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
