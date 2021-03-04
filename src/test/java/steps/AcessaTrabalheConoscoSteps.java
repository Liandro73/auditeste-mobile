package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.PaginaInicial;
import pages.TrabalheConosco;
import util.Screenshot;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaTrabalheConoscoSteps {

    private static WebDriver driver;

    static DesiredCapabilities capabilities = new DesiredCapabilities();

    @Before
    public static void inicializar() throws MalformedURLException {
        capabilities.setCapability("deviceName", "Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(CapabilityType.VERSION, "10.0");

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @After
    public static void finalizar() {
        driver.quit();
    }

    private TrabalheConosco trabalheConosco = new TrabalheConosco(driver);
    private PaginaInicial homePage = new PaginaInicial(driver);
    private Screenshot screenshot = new Screenshot(driver);

    @Dado("que estou na pagina trabalhe conosco")
    public void que_estou_na_pagina_trabalhe_conosco() {
        driver.get("https://auditeste.com.br/");
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        trabalheConosco.clicarBotaoMenuHamburger();
        trabalheConosco.clicarBotaoMenuTrabalheConosco();;
        assertEquals(trabalheConosco.verificarSeEstaNaPaginaTrabalheConosco().toUpperCase(), ("//TRABALHE\n" +
                "CONOSCO"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_trabalhe_conosco");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina trabalhe conosco")
    public void eu_navego_pela_pagina_trabalhe_conosco() {
        assertEquals(trabalheConosco.obterTextoPaginaTrabalheConosco(), ("Venha fazer parte da empresa referência em qualidade de software.\n" +
                "Cadastre o seu currículo e aguarde oportunidades."));
        assertEquals(trabalheConosco.obterTituloCampoNomeTrabalheConosco(), ("NOME"));
        assertEquals(trabalheConosco.verificarSeCampoNomeTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoEmailTrabalheConosco(), ("EMAIL"));
        assertEquals(trabalheConosco.verificarSeCampoEmailTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoTelefoneTrabalheConosco(), ("TELEFONE"));
        assertEquals(trabalheConosco.verificarSeCampoTelefoneTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoEnderecoTrabalheConosco(), ("ENDEREÇO"));
        assertEquals(trabalheConosco.verificarSeCampoEnderecoTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoCidadeTrabalheConosco(), ("ESCREVA O NOME DA SUA CIDADE"));
        assertEquals(trabalheConosco.verificarSeCampoCidadeTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoObjetivoProfissionalTrabalheConosco(), ("OBJETIVO PROFISSIONAL"));
        assertEquals(trabalheConosco.verificarSeCampoObjetivoProfissionalTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoAreaAtuacaoTrabalheConosco(), ("ÁREA"));
        assertEquals(trabalheConosco.verificarSeCampoAreaAtuacaoTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoMensagemTrabalheConosco(), ("MENSAGEM"));
        assertEquals(trabalheConosco.verificarSeCampoMensagemTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoAnexarTrabalheConosco(), ("ANEXAR CURRICULUM"));
        assertEquals(trabalheConosco.verificarSeCampoAnexarTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTextoTiposDeArquivosAceitosTrabalheConosco(), ("Arquivos aceitos: PDF, DOC, DOCX e TXT"));
        assertEquals(trabalheConosco.verificarSeBotaoEnviarFormularioTrabalheConosco(), (true));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_trabalhe_conosco");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}