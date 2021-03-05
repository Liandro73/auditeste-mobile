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

public class AcessaServicosAutomacaoProcessosSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosAutomacaoProcessosSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos automacao de processos")
    public void que_estou_na_pagina_servicos_automacao_de_processos() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesAutomacaoDeProcessos();
        assertEquals(servicos.verificarSeEstaEmAutomacaoDeProcessos().toUpperCase(), ("//AUTOMAÇÃO DE PROCESSOS"));
        try {
            screenshot.capturarScreenshot("entao_visualizo_a_pagina_automacao_de_processos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos automacao de processos")
    public void eu_navego_pela_pagina_servicos_automacao_de_processos() {
        assertEquals(servicos.obterPrimeiroTextoAutomacaoProcessos(), ("A automação de processos visa a otimização do ciclo de produção, identificando gargalos, pontos de ineficiência e desperdícios de recursos, permitindo monitoramento e controle de resultados, tanto de forma segmentada quanto global."));
        assertEquals(servicos.obterSegundoTextoAutomacaoProcessos(), ("Esse tipo de Automação possibilita o planejamento, a execução e o monitoramento de todos os processos de negócio, mantendo-os alinhados e permitindo sua constante melhoria."));
        assertEquals(servicos.obterTerceiroTextoAutomacaoProcessos(), ("Uma importante característica da automação de processos é a facilidade na extração de dados e indicadores, o que proporciona uma visão mais integral da organização e, consequentemente, melhora a tomada de decisões."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_automacao_de_processos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}