package br.com.haz.descontos;

import br.com.haz.entidades.Orcamento;
import br.com.haz.interfaces.Desconto;

public class DescontoPorCincoItens implements Desconto {
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 4 && orcamento.getItens().size() < 10) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconta(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
