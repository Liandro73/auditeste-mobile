package pages;

import common.Base;
import org.openqa.selenium.By;

public class Rodape extends Base {

    private Base base;

    private By textoRodapeContato = By.cssSelector("div > div:nth-child(1) > div > div > div.vc_custom_heading > b");
    private By linkRodapeTelefone = By.cssSelector("div > div:nth-child(1) > div > div > div:nth-child(3) > div > p:nth-child(1) > a > strong");
    private By linkRodapeUnidade = By.cssSelector("div > div:nth-child(1) > div > div > div:nth-child(3) > div > p:nth-child(2) > a:nth-child(1) > strong");
    private By linkRodapeEndereco = By.cssSelector("div > div:nth-child(1) > div > div > div:nth-child(3) > div > p:nth-child(2) > a:nth-child(3)");
    private By textoRodapeQuemSomos = By.cssSelector("div > div:nth-child(2) > div > div > div.vc_custom_heading > b");
    private By linkRodapeHistoria = By.cssSelector("div > div:nth-child(2) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(1)");
    private By linkRodapeMissaoVisaoEValores = By.cssSelector("div > div:nth-child(2) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(3)");
    private By linkRodapeNossosClientes = By.cssSelector("div > div:nth-child(2) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(5)");
    private By textoRodapeServicos = By.cssSelector("div > div:nth-child(3) > div > div > div.vc_custom_heading > b");
    private By linkRodapeFabricaDeTestes = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(1)");
    private By linkRodapeAutomatizacaoDeTestes = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(3)");
    private By linkRodapeTestesMobile = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(5)");
    private By linkRodapeTestesManuais = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(7)");
    private By linkRodapeTestesFuncionaisENaoFuncionais = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(9)");
    private By linkRodapeAlocacaoDeProfissionais = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(11)");
    private By linkRodapeAutomacaoDeProcessos = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(13)");
    private By linkRodapeCrowdsourcedAuditeste = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(15)");
    private By linkRodapeConsultoria = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(17)");
    private By linkRodapeCasesDeSucesso = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(1) > a > b");
    private By linkRodapeTrabalheConosco = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(3) > a > b");
    private By linkRodapeBlog = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(5) > a > b");
    private By linkRodapeWebmail = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(7) > a > b");
    private By textoRodapeContateNos = By.cssSelector("div > div.wpb_column.vc_column_container.vc_col-sm-4 > div > div > div:nth-child(3) > b");
    private By textoRodapeEmailMarketingAuditeste = By.xpath("//*[@id=\"links-rodape\"]/div/div[5]/div/div/div[4]");
    private By textoRodapeCopyright = By.cssSelector("footer.text-center");

    public Rodape(Base base) {
        this.base = base;
    }

    public String obterTextoRodapeContato() {
        return base.driver.findElement(textoRodapeContato).getText();
    }

    public String obterTextoLinkRodapeTelefone() {
        return base.driver.findElement(linkRodapeTelefone).getText();
    }

    public String obterTextoLinkRodapeUnidade() {
        return base.driver.findElement(linkRodapeUnidade).getText();
    }

    public String obterTextoLinkRodapeEndereco() {
        return base.driver.findElement(linkRodapeEndereco).getText();
    }

    public String obterTextoRodapeQuemSomos() {
        return base.driver.findElement(textoRodapeQuemSomos).getText();
    }

    public String obterTextoLinkRodapeHistoria() {
        return base.driver.findElement(linkRodapeHistoria).getText();
    }

    public String obterTextoLinkRodapeMissaoVisaoEValores() {
        return base.driver.findElement(linkRodapeMissaoVisaoEValores).getText();
    }

    public String obterTextoLinkRodapeNossosClientes() {
        return base.driver.findElement(linkRodapeNossosClientes).getText();
    }

    public String obterTextoRodapeServicos() {
        return base.driver.findElement(textoRodapeServicos).getText();
    }

    public String obterTextoLinkRodapeFabricaDeTestes() {
        return base.driver.findElement(linkRodapeFabricaDeTestes).getText();
    }

    public String obterTextoLinkRodapeAutomatizacaoDeTestes() {
        return base.driver.findElement(linkRodapeAutomatizacaoDeTestes).getText();
    }

    public String obterTextoLinkRodapeTestesMobile() {
        return base.driver.findElement(linkRodapeTestesMobile).getText();
    }

    public String obterTextoLinkRodapeTestesManuais() {
        return base.driver.findElement(linkRodapeTestesManuais).getText();
    }

    public String obterTextoLinkRodapeTestesFuncionaisENaoFuncionais() {
        return base.driver.findElement(linkRodapeTestesFuncionaisENaoFuncionais).getText();
    }

    public String obterTextoLinkRodapeAlocacaoDeProfissionais() {
        return base.driver.findElement(linkRodapeAlocacaoDeProfissionais).getText();
    }

    public String obterTextoLinkRodapeAutomacaoDeProcessos() {
        return base.driver.findElement(linkRodapeAutomacaoDeProcessos).getText();
    }

    public String obterTextoLinkRodapeCrowdsourcedAuditeste() {
        return base.driver.findElement(linkRodapeCrowdsourcedAuditeste).getText();
    }

    public String obterTextoLinkRodapeConsultoria() {
        return base.driver.findElement(linkRodapeConsultoria).getText();
    }

    public String obterTextoLinkRodapeCasesDeSucesso() {
        return base.driver.findElement(linkRodapeCasesDeSucesso).getText();
    }

    public String obterTextoLinkRodapeTrabalheConosco() {
        return base.driver.findElement(linkRodapeTrabalheConosco).getText();
    }

    public String obterTextoLinkRodapeBlog() {
        return base.driver.findElement(linkRodapeBlog).getText();
    }

    public String obterTextoLinkRodapeWebmail() {
        return base.driver.findElement(linkRodapeWebmail).getText();
    }

    public String obterTextoRodapeContateNos() {
        return base.driver.findElement(textoRodapeContateNos).getText();
    }

    public String obterTextoRodapeEmailMarketingAuditeste() {
        return base.driver.findElement(textoRodapeEmailMarketingAuditeste).getText();
    }

    public String obterTextoRodapeCopyright() {
        return base.driver.findElement(textoRodapeCopyright).getText();
    }

}