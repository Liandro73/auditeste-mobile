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

public class AcessaServicosConsultoriaSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosConsultoriaSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos consultoria")
    public void que_estou_na_pagina_servicos_consultoria() {

        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesConsultoria();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//CONSULTORIA"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_a_pagina_consultoria");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina servicos consultoria")
    public void eu_navego_pela_pagina_servicos_consultoria() {
        assertEquals(servicos.obterPrimeiroTextoConsultoria(), ("Otimizar a área de TI e promover a qualidade das aplicações é sempre um grande desafio, que na maioria das vezes pode desequilibrar a balança do custo x benefício, gerando um alto gasto para empresa e mínimos resultados. Por isso, para garantia do sucesso e certificação de qualidade de seus projetos em TI é de grande importância firmar parceria com uma empresa que tenha experiência de mercado e conhecimento necessário para atender as necessidades de seus clientes e gerar os resultados esperados."));
        assertEquals(servicos.obterSegundoTextoConsultoria(), ("E com a atuação desde 2001 e diversos cases de sucesso em seu portfólio, a Auditeste mostra que possui esses requisitos e o Know-How necessário para te atender, garantindo assim a tranquilidade e segurança de que tudo está sendo encaminhado para o sucesso."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_consultoria");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}