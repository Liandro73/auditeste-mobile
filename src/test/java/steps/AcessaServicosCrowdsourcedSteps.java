package steps;

import common.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.PaginaInicial;
import pages.Servicos;
import util.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaServicosCrowdsourcedSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosCrowdsourcedSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos crowdsourced")
    public void que_estou_na_pagina_servicos_crowdsourced() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesCrowdsourced();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//CROWDSOURCED AUDITESTE"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_a_pagina_crowdsourced_auditeste");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos crowdsourced")
    public void eu_navego_pela_pagina_servicos_crowdsourced() {
        assertEquals(servicos.obterTextoBotaoAcesseJaCrowdsourced(), ("ACESSE JÁ"));
        assertEquals(servicos.obterTextoBotaoCadastreSeCrowdsourced(), ("CADASTRE-SE"));
        assertEquals(servicos.obterPrimeiroTextoCrowdsourced(), ("Desenvolver um aplicativo para smartphones, tablets ou um software para a web e desktop é uma tarefa que requer uma série de cuidados especiais. É muito comum o aparecimento de problemas durante a efetiva execução do produto — os chamados bugs."));
        assertEquals(servicos.obterSegundoTextoCrowdsourced(), ("Para evitar estes tipos de problemas, a utilização do Crowdsourced Auditeste, ajudará a realizar testes diretamente com os usuários para detectar e sanar possíveis falhas."));
        assertEquals(servicos.obterTerceiroTextoCrowdsourced(), ("Com esta modalidade de testes será possível ter acesso a diversos tipos de plataformas, como navegadores web, sistemas operacionais ou de dispositivos móveis."));
        assertEquals(servicos.obterQuartoTextoCrowdsourced(), ("Essa ferramenta não demanda um grande investimento ou o uso de equipamentos sofisticados para a validação das aplicações."));
        assertEquals(servicos.obterTituloCrowdsourced(), ("COMO FUNCIONA?"));
        assertEquals(servicos.obterQuintoTextoCrowdsourced(), ("O Crowdsourced Auditeste (CA) cria a possibilidade de:"));
        assertEquals(servicos.obterSextoTextoCrowdsourced(), ("Execução de testes finais, em qualquer situação e ambiente de uso;"));
        assertEquals(servicos.obterSetimoTextoCrowdsourced(), ("Testes feitos de maneira colaborativa, porém remunerada, por voluntários freelancers e com perfis aproximados dos usuários finais (conforme requisitos informados pelo Cliente)."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_crowdsourced_auditeste");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}