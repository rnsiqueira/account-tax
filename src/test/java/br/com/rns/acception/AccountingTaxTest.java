package br.com.rns.acception;

import br.com.rns.ApplicationStart;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@RunWith(Cucumber.class)
@SpringBootTest(classes = ApplicationStart.class)
@ActiveProfiles("test")
public class AccountingTaxTest {

    private String corporateName;
    private String month;
    private int value;

    @Dado("os parâmetros da nota razão social {string}. mês da nota emitida {string}, valor {int}")
    public void osParâmetrosDaNotaRazãoSocialMêsDaNotaEmitidaValor(String corporateName, String month, int value) {
        this.corporateName = corporateName;
        this.month = month;
        this.value = value;
    }

    @Então("taxa de imposto sobre a nota deve ser no valor de {int}")
    public void taxaDeImpostoSobreANotaDeveSerNoValorDe(int taxValue) {
    }

    @E("valor de lucro liquido de ser de {int}")
    public void valorDeLucroLiquidoDeSerDe(int netProfit) {
    }

}
