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

public class AcessaServicosManuaisSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosManuaisSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos testes manuais")
    public void que_estou_na_pagina_servicos_testes_manuais() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesManuais();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//TESTES MANUAIS"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_a_pagina_testes_manuais");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos testes manuais")
    public void eu_navego_pela_pagina_servicos_testes_manuais() {
        assertEquals(servicos.obterTextoTestesManuais(), ("Diferentemente dos testes automatizados, os testes manuais são executados somente por profissionais capacitados para tarefa, que seguem criteriosamente as documentações de requisitos e negócios, onde estão relacionadas às situações convencionais e não convencionais do sistema. Este documento tanto pode ser fornecido pelo cliente, como elaborado por nossos profissionais."));
        assertEquals(servicos.obterSegundoTextoTestesManuais(), ("Este tipo de teste envolve ainda mais o lado intelectual, analítico e lógico do ser humano, devido a necessidade de efetuar uma verificação minuciosa da aplicação a ser testada para identificação e neutralização de possíveis riscos e adequação a uma boa experiência do usuário."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_testes_manuais");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}