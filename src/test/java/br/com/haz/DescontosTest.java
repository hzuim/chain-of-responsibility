package br.com.haz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.haz.chain.CadeiaDeDesconto;
import br.com.haz.entidades.Item;
import br.com.haz.entidades.Orcamento;

public class DescontosTest {

	private CadeiaDeDesconto cadeia;
	private Orcamento orcamentoComDoisItens;
	private Orcamento orcamentoComCincoItens;
	private Orcamento orcamentoComDezItens;

	@Before
	public void setUp() throws Exception {
		cadeia = new CadeiaDeDesconto();
		
		orcamentoComDoisItens = new Orcamento(500);
		orcamentoComDoisItens.adicionaItem(new Item("CANETA", 250.00));
		orcamentoComDoisItens.adicionaItem(new Item("LAPIS", 250.00));

		orcamentoComCincoItens = new Orcamento(500);
		orcamentoComCincoItens.adicionaItem(new Item("CANETA", 100.00));
		orcamentoComCincoItens.adicionaItem(new Item("LAPIS", 100.00));
		orcamentoComCincoItens.adicionaItem(new Item("LAPISEIRA", 100.00));
		orcamentoComCincoItens.adicionaItem(new Item("BORRACHA", 100.00));
		orcamentoComCincoItens.adicionaItem(new Item("PAPEL", 100.00));

		orcamentoComDezItens = new Orcamento(500);
		orcamentoComDezItens.adicionaItem(new Item("CANETA", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("LAPIS", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("LAPISEIRA", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("BORRACHA", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("PAPEL", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("CORRETIVO", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("ESTOJO", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("COMPASSO", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("RÉGUA", 50.00));
		orcamentoComDezItens.adicionaItem(new Item("CORRETIVO", 50.00));
	}

	@Test
	public void doisItens() {
		double descontoAtual = cadeia.calcularDesconto(orcamentoComDoisItens);
		Assert.assertEquals(0.00, descontoAtual, Double.MIN_VALUE);
	}
	
	@Test
	public void cincoItens() {
		double descontoAtual = cadeia.calcularDesconto(orcamentoComCincoItens);
		Assert.assertEquals(50.00, descontoAtual, Double.MIN_VALUE);
	}
	
	@Test
	public void dezItens() {
		double descontoAtual = cadeia.calcularDesconto(orcamentoComDezItens);
		Assert.assertEquals(100.00, descontoAtual, Double.MIN_VALUE);
	}

}
