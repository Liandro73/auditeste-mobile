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

public class AcessaServicosAlocacaoProfissionaisSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosAlocacaoProfissionaisSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos alocacao profissionais")
    public void que_estou_na_pagina_servicos_alocacao_profissionais() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesAlocacaoDeProfissionais();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//ALOCAÇÃO DE PROFISSIONAIS"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_a_pagina_alocacao_de_profissionais");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos alocacao profissionais")
    public void eu_navego_pela_pagina_servicos_alocacao_profissionais() {
        assertEquals(servicos.obterPrimeiroTextoAlocacaoProfissionais(), ("Identificar perfis para qualquer oportunidade do mercado, já não é uma tarefa simples e para um nicho específico da área de TI que exigem requisitos, capacitações e certificações específicas, tornam a tarefa ainda mais árdua. Por isso, para as empresas que procuram profissionais de TI do setor de qualidade de software, nada melhor que deixar essa tarefa nas mãos de quem tem a experiência e os processos de seleção e avaliação necessários para trazer a você os melhores e mais capacitados profissionais do mercado."));
        assertEquals(servicos.obterTituloBeneficioAlocacaoProfissionais(), ("PRINCIPAIS BENEFÍCIOS"));
        assertEquals(servicos.obterTextoPrimeiroBeneficioAlocacaoProfissionais(), ("Assertividade"));
        assertEquals(servicos.obterTextoSegundoBeneficioAlocacaoProfissionais(), ("Prazos Otimizados"));
        assertEquals(servicos.obterTextoTerceiroBeneficioAlocacaoProfissionais(), ("Otimização de Custos"));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_alocacao_de_profissionais");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}