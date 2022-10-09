package br.com.rns.controller;


import br.com.rns.ApplicationStart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ApplicationStart.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class InvoiceControllerIntegrationTest {


    @Test
    public void runTest() {
        System.out.println("passed");
    }
}
