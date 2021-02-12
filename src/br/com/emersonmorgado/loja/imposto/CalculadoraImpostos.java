package br.com.emersonmorgado.loja.imposto;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class CalculadoraImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		
		switch (tipoImposto) {
		case ICMS:
			return orcamento.getValor().multiply(new BigDecimal("0.18"));
		case ISS:
			return orcamento.getValor().multiply(new BigDecimal("0.02"));
		case IPI:
			return orcamento.getValor().multiply(new BigDecimal("0.20"));
		case PIS:
			return orcamento.getValor().multiply(new BigDecimal("0.0165"));
		case COFINS:
			return orcamento.getValor().multiply(new BigDecimal("0.076"));			
		default:
			break;
		}
		return BigDecimal.ZERO;
	}
}
