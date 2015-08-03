package br.com.haz.interfaces;

import br.com.haz.entidades.Orcamento;

public interface Desconto {
	
	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);

}
