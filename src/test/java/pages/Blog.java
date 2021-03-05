package pages;

import common.Base;
import org.openqa.selenium.By;

public class Blog extends Base {

    private Base base;

    //Itens Menu Hamburguer
    private By botaoMenu = By.xpath("//button[contains(@class, 'navbar-toggle')]");
    private By botaoMenuBlog = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[6]/a");

    private By tituloPaginaBlog = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div/div/h1");

    private By numeroPaginaAtualBlog = By.xpath("//span[contains(@class, 'page-numbers current')]");
    private By proximaPaginaBlog = By.xpath("//a[contains(@class, 'next page-numbers')]");
    private By paginaAnteriorBlog = By.xpath("//a[contains(@class, 'prev page-numbers')]");
    private By blocosDePotagens = By.xpath("//div[contains(@class, 'bloco-post')]");

    private By textoSeuProjetoComSucessoGarantido = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[1]/div/div/div[2]");
    private By linkParaSolicitarOrcamento = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[2]/div/div/div[1]/a");

    public Blog(Base base) {
        this.base = base;
    }

    public void clicarbotaoMenu() {
        base.driver.findElement(botaoMenu).click();
    }

    public void clicarMenuItemBlog() {
        base.driver.findElement(botaoMenuBlog).click();
    }

    public String verificarSeEstaNaPaginaBlog() {
        return base.driver.findElement(tituloPaginaBlog).getText();
    }

    public String obterNumeroPaginaAtualBlog() {
        return base.driver.findElement(numeroPaginaAtualBlog).getText();
    }

    public int obterQuantidadeBlocosDePotagens() {
        return base.driver.findElements(blocosDePotagens).size();
    }

    public boolean vericarBlocosDePotagensEstaVisivel() {
        return base.driver.findElement(blocosDePotagens).isDisplayed();
    }

    public boolean vericarBotaoProximaPaginaBlogEstaVisivel() {
        return base.driver.findElement(proximaPaginaBlog).isDisplayed();
    }

    public boolean vericarBotaoPaginaAnteriorBlogEstaVisivel() {
        return base.driver.findElement(paginaAnteriorBlog).isDisplayed();
    }

    public void clicarBotaoProximaPaginaBlog() {
        base.driver.findElement(proximaPaginaBlog).click();
    }

    public void clicarBotaoPaginaAnteriorBlog() {
        base.driver.findElement(paginaAnteriorBlog).click();
    }

}