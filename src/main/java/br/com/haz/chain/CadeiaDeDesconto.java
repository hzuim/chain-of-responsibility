package br.com.haz.chain;

import br.com.haz.descontos.DescontoPorCincoItens;
import br.com.haz.descontos.DescontoPorDezItens;
import br.com.haz.descontos.SemDesconto;
import br.com.haz.entidades.Orcamento;
import br.com.haz.interfaces.Desconto;

public class CadeiaDeDesconto {
	
	private Desconto d1;

	public CadeiaDeDesconto() {
		d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorDezItens();
		Desconto d3 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
	}

	public double calcularDesconto(Orcamento orcamento) {
		return d1.desconta(orcamento);
	}

}
