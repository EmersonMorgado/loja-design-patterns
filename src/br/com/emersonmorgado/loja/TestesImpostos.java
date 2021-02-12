package br.com.emersonmorgado.loja;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.imposto.COFINS;
import br.com.emersonmorgado.loja.imposto.CalculadoraImpostos;
import br.com.emersonmorgado.loja.imposto.ICMS;
import br.com.emersonmorgado.loja.imposto.IPI;
import br.com.emersonmorgado.loja.imposto.ISS;
import br.com.emersonmorgado.loja.imposto.PIS;
import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento =  new Orcamento(new BigDecimal("100"));
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		System.out.println(calculadora.calcular(orcamento, new IPI()));
		System.out.println(calculadora.calcular(orcamento, new PIS()));
		System.out.println(calculadora.calcular(orcamento, new COFINS()));
	}
}
