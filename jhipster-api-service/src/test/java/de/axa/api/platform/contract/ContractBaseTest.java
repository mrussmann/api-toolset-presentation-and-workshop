package de.axa.api.platform.contract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import de.axa.api.platform.ApiserviceApp;

import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes={ApiserviceApp.class})
public abstract class ContractBaseTest {

    @Autowired
    private WebApplicationContext webAppContext;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(webAppContext);
    }
}
