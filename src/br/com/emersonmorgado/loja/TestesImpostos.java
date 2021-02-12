package br.com.emersonmorgado.loja;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.imposto.CalculadoraImpostos;
import br.com.emersonmorgado.loja.imposto.TipoImposto;
import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento =  new Orcamento(new BigDecimal("100"));
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ICMS));
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
		System.out.println(calculadora.calcular(orcamento, TipoImposto.IPI));
		System.out.println(calculadora.calcular(orcamento, TipoImposto.PIS));
		System.out.println(calculadora.calcular(orcamento, TipoImposto.COFINS));
	}

}
