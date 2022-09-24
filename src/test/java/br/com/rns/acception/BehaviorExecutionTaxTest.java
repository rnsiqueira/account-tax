package br.com.rns.acception;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.junit.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
public class BehaviorExecutionTaxTest {
    @Dado("os parâmetros da nota razão social {string}. mês da nota emitida {string}, valor {int}")
    public void osParâmetrosDaNotaRazãoSocialMêsDaNotaEmitidaValor(String arg0, String arg1, int arg2) {
    }

    @Então("taxa de imposto sobre a nota deve ser no valor de {int}")
    public void taxaDeImpostoSobreANotaDeveSerNoValorDe(int arg0) {
    }

    @E("valor de lucro liquido de ser de {int}")
    public void valorDeLucroLiquidoDeSerDe(int arg0) {
    }
}
