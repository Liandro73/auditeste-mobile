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

public class AcessaServicosFuncionaisNaoFuncionaisSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosFuncionaisNaoFuncionaisSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos testes funcionais nao funcionais")
    public void que_estou_na_pagina_servicos_testes_funcionais_nao_funcionais() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesFuncionaisNaoFuncionais();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//TESTES FUNCIONAIS NÃO FUNCIONAIS"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_a_pagina_testes_funcionais_e_nao_funcionais");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos testes funcionais nao funcionais")
    public void eu_navego_pela_pagina_servicos_testes_funcionais_nao_funcionais() {
        assertEquals(servicos.obterTituloTestesFuncionais(), ("TESTES FUNCIONAIS"));
        assertEquals(servicos.obterTextoTestesFuncionais(), ("Os testes funcionais também são conhecidos como teste da “caixa-preta”, pois é realizado para entender o comportamento da aplicação durante a navegação do usuário, ou seja, testando definitivamente a funcionalidade do sistema, simulando um cenário de produção e identificando possíveis problemas na interface do mesmo."));
        assertEquals(servicos.obterTituloTestesNaoFuncionais(), ("TESTES NÃO FUNCIONAIS"));
        assertEquals(servicos.obterTextoTestesNaoFuncionais(), ("Testes não funcionais, diferentemente do anterior, não são relacionados à funcionalidade da aplicação em si, pois simulam os cenários de acessos, performance e estresse, testando os atributos de um componente do sistema efetuando uma verificação mais profunda e analítica do servidor."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_funcionais_nao_funcionais");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}