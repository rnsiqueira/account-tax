package br.com.rns.config;

import br.com.rns.ApplicationStart;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = ApplicationStart.class)
@ContextConfiguration(classes = ApplicationStart.class, loader = SpringBootContextLoader.class)
@ActiveProfiles("test")
public class CucumberSpringContextConfiguration {

    @Before
    public void setUp() {

    }
}
