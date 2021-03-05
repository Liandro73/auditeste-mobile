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

public class AcessaServicosFabricaTestesSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosFabricaTestesSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos fabrica de testes")
    public void que_estou_na_pagina_servicos_fabrica_de_testes() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuFabricaDeTestes();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//FÁBRICA DE TESTES"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_a_pagina_fabrica_de_testes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos fabrica de testes")
    public void eu_navego_pela_pagina_servicos_fabrica_de_testes() {
        assertEquals(servicos.obterTituloTestesFabricaTestes(), ("LOCALIZAÇÃO"));
        assertEquals(servicos.obterPrimeiroTextoFabricaTestes(), ("A Auditeste possui vasta experiência no segmento de testes e certificação de software, entregando qualidade e garantindo o sucesso dos projetos e respectivamente a satisfação de seus clientes desde 2001."));
        assertEquals(servicos.obterSegundoTextoFabricaTestes(), ("Contam com profissionais capacitados e certificados (CTFL, IBQTS, Scrum, ITIL), com infraestrutura de qualidade e amplo domínio em ferramentas como: HP Quality Center, TFS, ALM Microfocus, UFT, Test Complete, Selenium, Test Link, Jira, Mantis, Ruby, entre outras."));
        assertEquals(servicos.obterTerceiroTextoFabricaTestes(), ("Possibilitando atender a demanda em testes e qualidade de software, agregando de fato aos resultados finais e sucesso dos projetos de seus clientes, atuando desde a gestão e estruturação inicial até a entrega e consequentemente satisfação dos usuários."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_fabrica_de_testes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}