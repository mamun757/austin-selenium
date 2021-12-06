package playground;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.DateUtils;

public class TestNgPlayGround {
    private static final Logger LOGGER = LogManager.getLogger(TestNgPlayGround.class);

    @Test
    public void runTheTest(){
        System.out.println(DateUtils.returnNextMonth());
        LOGGER.info("Return next month is: DEC");
        LOGGER.debug(" Return next month is: Jan");
        LOGGER.error("This is an error");
        LOGGER.fatal("This is dangerous");
        LOGGER.warn("This is a warning message");
    }
}
