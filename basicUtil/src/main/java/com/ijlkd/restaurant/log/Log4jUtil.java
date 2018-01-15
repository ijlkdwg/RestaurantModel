package com.ijlkd.restaurant.log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4jUtil {
    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    public Log4jUtil(){

    }
    public static void main(String[] args) {

        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.fatal("fatal message");
    }
}
