package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.*;


public class CompartilhadoSteps {
	
	@Dado("que eu estou no site da gama academy {string}")
	public void que_eu_estou_no_site_da_gama_academy(String string) {
		Configuracoes.abrir(string);
	}
}
