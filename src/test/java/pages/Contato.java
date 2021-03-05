package pages;

import common.Base;
import org.openqa.selenium.By;

public class Contato extends Base {

    private Base base;

    //Itens Menu Hamburguer
    private By botaoMenu = By.xpath("//button[contains(@class, 'navbar-toggle')]");
    private By botaoMenuContato = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[7]/a");

    private By tituloPaginaBlog = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/h1");

    private By tituloTelefoneContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/b");
    private By textoTelefoneContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/a");
    private By tituloUnidadeCentroContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/div/div/div[1]/a/b");
    private By textoUnidadeCentroContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/div/div/div[2]/a");
    private By tituloUnidadeBarueriContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/div/div/div[1]/a/b");
    private By textoUnidadeBarueriContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/a");
    private By tituloFormularioContato = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[2]/b");
    private By tituloNomeFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[1]/div/div/div/div/div[1]/label/span");
    private By campoNomeFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[1]/div/div/div/div/div[2]/input");
    private By tituloEmailFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[2]/div/div/div/div/div[1]/label/span");
    private By campoEmailFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[2]/div/div/div/div/div[2]/input");
    private By tituloTelefoneFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[3]/div/div/div/div/div[1]/label/span");
    private By campoTelefoneFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[3]/div/div/div/div/div[2]/input");
    private By tituloEmpresaFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[1]/div/div/div/div/div[1]/label/span");
    private By campoEmpresaFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[1]/div/div/div/div/div[2]/input");
    private By tituloFalarComFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[2]/div/div/div/div/div[1]/label/span");
    private By campoFalarComFormContato = By.xpath("//*[@id=\"field_container\"]/div/div[2]/select");
    private By tituloMensagemFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div/div/div[1]/label/span");
    private By campoMensagemFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div/div/div[2]/textarea");
    private By botaoEnviarFormularioContato = By.xpath("//*[@id=\"field_container\"]/div/div/button");

    private By textoSeuProjetoComSucessoGarantido = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[1]/div/div/div[2]");
    private By linkParaSolicitarOrcamento = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[2]/div/div/div[1]/a");

    public Contato(Base base) {
        this.base = base;
    }

    public void clicarBotaoMenu() {
        base.driver.findElement(botaoMenu).click();
    }

    public void clicarBotaoMenuContato() {
        base.driver.findElement(botaoMenuContato).click();
    }

    public String verificarSeEstaNaPaginaContato() {
        return base.driver.findElement(tituloPaginaBlog).getText();
    }

    public String obterTituloTelefoneContato() {
        return base.driver.findElement(tituloTelefoneContato).getText();
    }

    public String obterTextoTelefoneContato() {
        return base.driver.findElement(textoTelefoneContato).getText();
    }

    public String obterTituloUnidadeCentroContato() {
        return base.driver.findElement(tituloUnidadeCentroContato).getText();
    }

    public String obterTextoUnidadeCentroContato() {
        return base.driver.findElement(textoUnidadeCentroContato).getText();
    }

    public String obterTituloUnidadeBarueriContato() {
        return base.driver.findElement(tituloUnidadeBarueriContato).getText();
    }

    public String obterTextoUnidadeBarueriContato() {
        return base.driver.findElement(textoUnidadeBarueriContato).getText();
    }

    public String obterTituloFormularioContato() {
        return base.driver.findElement(tituloFormularioContato).getText();
    }

    public String obterTituloNomeFormContato() {
        return base.driver.findElement(tituloNomeFormContato).getText();
    }

    public boolean verificarCampoNomeFormContatoEstaVisivel() {
        return base.driver.findElement(campoNomeFormContato).isDisplayed();
    }

    public String obterTituloEmailFormContato() {
        return base.driver.findElement(tituloEmailFormContato).getText();
    }

    public boolean verificarCampoEmailFormContatoEstaVisivel() {
        return base.driver.findElement(campoEmailFormContato).isDisplayed();
    }

    public String obterTituloTelefoneFormContato() {
        return base.driver.findElement(tituloTelefoneFormContato).getText();
    }

    public boolean verificarTelefoneFormContatoEstaVisivel() {
        return base.driver.findElement(campoTelefoneFormContato).isDisplayed();
    }

    public String obterTituloEmpresaFormContato() {
        return base.driver.findElement(tituloEmpresaFormContato).getText();
    }

    public boolean verificarEmpresaFormContatoEstaVisivel() {
        return base.driver.findElement(campoEmpresaFormContato).isDisplayed();
    }

    public String obterTituloFalarComFormContato() {
        return base.driver.findElement(tituloFalarComFormContato).getText();
    }

    public boolean verificarFalarComFormContatoEstaVisivel() {
        return base.driver.findElement(campoFalarComFormContato).isDisplayed();
    }

    public String obterTituloMensagemFormContato() {
        return base.driver.findElement(tituloMensagemFormContato).getText();
    }

    public boolean verificarMensagemFormContatoEstaVisivel() {
        return base.driver.findElement(campoMensagemFormContato).isDisplayed();
    }

    public boolean verificarBotaoEnviarFormularioContatoEstaVisivel() {
        return base.driver.findElement(botaoEnviarFormularioContato).isDisplayed();
    }

}