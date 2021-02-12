package br.com.emersonmorgado.loja;

import java.math.BigDecimal;

import br.com.emersonmorgado.loja.desconto.CalculadoraDesconto;
import br.com.emersonmorgado.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		
		Orcamento orc1 =  new Orcamento(new BigDecimal("200"), 6);
		System.out.println(calculadora.calcular(orc1));
		
		Orcamento orc2 =  new Orcamento(new BigDecimal("1000"), 1);
		System.out.println(calculadora.calcular(orc2));

	}
}
