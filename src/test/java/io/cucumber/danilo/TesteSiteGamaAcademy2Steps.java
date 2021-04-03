package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class TesteSiteGamaAcademy2Steps{
	
	int contador = 0;
	
	@Dado("clico em Product Management")
	public void clico_em_Product_Management() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"w-slider-mask-1\"]/div[1]/div/div[3]/a")).click();
	}
	
	@Dado("abro uma nova aba")
	public void abro_uma_nova_aba() throws InterruptedException{
		List<String> abas = new ArrayList<>(Configuracoes.browser.getWindowHandles());
		Configuracoes.browser.switchTo().window(abas.get(1));
		Thread.sleep(5000);
	}
	
	@Dado("clico na opcao QUERO ME INSCREVER")
	public void clico_na_opcao_QUERO_ME_INSCREVER() {
		Configuracoes.browser.findElement(By.cssSelector("a[class='lp-element lp-pom-button']")).click();
	}
	
	@Dado("clico na opcao para fechar o popup")
	public void clico_na_opcao_para_fechar_o_popup() throws InterruptedException {
		Configuracoes.browser.findElement(By.cssSelector("button[class='close__2NcGKV']")).click();
		Thread.sleep(15000);
	}
	
	@Entao("devo ver o valor")
	public void devo_ver_o_valor() {
		int valor = Configuracoes.browser.findElements(By.cssSelector(".lplh-29")).size();
		assertEquals(true, valor > 0);
	}
	
	@Entao("o botao QUERO ME MATRICULAR")
	public void o_botao_QUERO_ME_MATRICULAR() {
		int botao = Configuracoes.browser.findElements(By.cssSelector("a[class='lp-element lp-pom-button']")).size();
		assertEquals(true, botao > 0);
		Configuracoes.fechar();
	}
	
	@Dado("clico na opcao DEV FULL STACK")
	public void clico_na_opcao_DEV_FULL_STACK() {
		Configuracoes.browser.findElement(By.cssSelector("a[class='bt-chamada btc-alt w-button']")).click();
	}
	
	@Entao("devo ver as opcoes")
	public void devo_ver_as_opcoes(List<String> dataTable) {
		WebElement elementsRoot = Configuracoes.browser.findElement(By.cssSelector("div[class='collection-list w-dyn-items']"));
		
		for(int i = 0; i < dataTable.toArray().length; ++i) {
			String texto = new String(elementsRoot.getText());
			
			if(texto.contains(dataTable.toArray()[i].toString())) {
    			contador++;
			}
		}
		
		assertEquals(4, contador);
		Configuracoes.fechar();
	}
}