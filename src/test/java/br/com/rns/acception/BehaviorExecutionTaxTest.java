package br.com.rns.acception;

import br.com.rns.ApplicationStart;
import br.com.rns.service.ServiceInvoice;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@CucumberContextConfiguration
@SpringBootTest(classes = ApplicationStart.class)
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        features = {"src/test/resources/accepting/"})
public class BehaviorExecutionTaxTest {
    private String corporateName;
    private String month;
    private int value;

    @Autowired
    private ServiceInvoice serviceInvoice;

    @Dado("os parâmetros da nota razão social {string}. mês da nota emitida {string}, valor {int}")
    public void osParâmetrosDaNotaRazãoSocialMêsDaNotaEmitidaValor(String corporateName, String month, int value) {
        this.corporateName = corporateName;
        this.month = month;
        this.value = value;
    }

    @Então("taxa de imposto sobre a nota deve ser no valor de {int}")
    public void taxaDeImpostoSobreANotaDeveSerNoValorDe(int tributeValue) {
        assertEquals(null, tributeValue);
    }

    @E("valor de lucro liquido de ser de {int}")
    public void valorDeLucroLiquidoDeSerDe(int profitValue) {
    }
}
