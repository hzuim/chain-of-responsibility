package br.com.haz.descontos;

import br.com.haz.entidades.Orcamento;
import br.com.haz.interfaces.Desconto;

public class SemDesconto implements Desconto {

	public double desconta(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Desconto proximo) {
	}

}
