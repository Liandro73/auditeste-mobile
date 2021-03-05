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

public class AcessaServicosMobileSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosMobileSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos testes mobile")
    public void que_estou_na_pagina_servicos_testes_mobile() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesMobile();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//TESTES MOBILE"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_a_pagina_testes_mobile");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos testes mobile")
    public void eu_navego_pela_pagina_servicos_testes_mobile() {
        assertEquals(servicos.obterTextoTestesMobile(), ("O número de dispositivos móveis e os adeptos a esta tecnologia aumentam a cada dia, levando a grande necessidade das empresas adaptarem seus serviços e sistemas a este meio. Porém, é muito importante ao efetuar essa adaptação manter a qualidade, garantir o bom funcionamento e a boa usabilidade para o cliente, afinal é a reputação de sua empresa que está em jogo."));
        assertEquals(servicos.obterTituloTestesMobile(), ("GARANTINDO A QUALIDADE"));
        assertEquals(servicos.obterPrimeiroTextoTestesMobile(), ("Para isso, existem os testes mobile que se diferenciam dos aplicados em desktop, pois a imensa variedade de modelos e sistemas de dispositivos móveis não permitem a padronização do ambiente, havendo a necessidade da elaboração de cenários específicos para cada tipo de aparelho."));
        assertEquals(servicos.obterSegundoTextoTestesMobile(), ("Além disso, a automação desses testes contam com ferramentas que permitem um envolvimento mais efetivo de todos profissionais do projeto no processo de validação da aplicação, sendo uma ótima solução para melhoria da experiência mobile."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_testes_mobile");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}