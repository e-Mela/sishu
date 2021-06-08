package com.gap.invoiceservice;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.emela.sushi.SushiApplication;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.TestPropertySource;

/**
 * <p>
 * This contains the Sushi Random Picker Contract test for different scenarios.
 */
@SpringBootTest(
        classes = {SushiApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(PactRunner.class)
@Provider("SushiApplicationProvider")
@PactFolder("contract")
@TestPropertySource(locations = "classpath:contract-test.properties")
public class SushiAppContractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SushiAppContractTest.class);
    private static final String SUCCESS_STATE ="SUCCESS - 200";

    @TestTarget
    public final Target target = new HttpTarget(9097);


    private TestContextManager testContextManager;

    @BeforeClass
    public static void setup() {
    }

    @Before
    public void before() throws Exception {
        testContextManager = new TestContextManager(getClass());
        testContextManager.prepareTestInstance(this);
    }

    @State(SUCCESS_STATE)
    public void testSuccess() {
        LOGGER.info("Now service in ::" + SUCCESS_STATE + ":: state");
    }
    
    

}