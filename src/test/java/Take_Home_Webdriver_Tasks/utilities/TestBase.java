package Take_Home_Webdriver_Tasks.utilities;

import org.junit.Before;

public abstract class TestBase {


    @Before
    public static void setUpBaseUrl(String endPoint){
       String baseURI= ConfigurationReader.getProperty("base.uri");
        Driver.getDriver().get(baseURI + endPoint);

    }
}
