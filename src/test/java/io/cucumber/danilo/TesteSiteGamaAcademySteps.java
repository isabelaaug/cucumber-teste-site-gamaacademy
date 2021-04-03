package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.danilo.servicos.Configuracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class TesteSiteGamaAcademySteps{
	
	@Dado("clico na opcao para fechar a propaganda")
	public void clico_na_opcao_para_fechar_a_propaganda() throws InterruptedException {
		Thread.sleep(15000);
		Configuracoes.browser.findElement(By.cssSelector(".ub-emb-close")).click();
	}
	
	@Dado("clico na opcao QUEM SOMOS")
	public void clico_na_opcao_QUEM_SOMOS() {
		Configuracoes.browser.findElement(By.cssSelector("a[class='nav-link nav w-nav-link']")).click();
	}

	@Entao("devo ver o item {string}")
	public void devo_ver_o_item(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector(".manifesto h1.heading.lado"));
		assertEquals(string, input.getText());
		Configuracoes.fechar();
	}
}