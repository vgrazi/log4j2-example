package com.vgrazi.example;



import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.time.LocalDate;

public class Log4j2Example {
        private static final Logger logger
                = LogManager.getLogger(Log4j2Example.class);
        //            = LogManager.getLogger(Log4J2LoggingExample.class.getName());
//            = LogManager.getLogger(MethodHandles.lookup().lookupClass().getName());
//
//    private static final Logger logger = LogManager.getLogger(Log4J2LoggingExample.class.getName());
        private static boolean running = true;
//    private static final Logger logger = Logger.getLogger("this.is.my.awesome.Logger");

//    private static final Logger logger= LogManager.getFormatterLogger(Log4J2LoggingExample.class);


        public static void main(String[] args) {
            User user = new User(1, "John Jones", "123 Main");
//        logger.debug("User is user {} with age {}", user, user.getAge());
//        logger.debug("User is user {} with age {}", user, user.getAge());
//        String.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d")
//        logger.log(Level.FATAL, "%4$2s %3$2s %2$2s %1$2s", "a", "b", "c");
            logger.printf(Level.FATAL, "User is %20s with age %5.2f", user.getName(), user.getAge());
//
            logger.trace("Some TRACE message");
            logger.fatal("Some Fatal message");
            logger.error("Some ERROR message");
            logger.warn("Some WARN message");
            logger.info("Some INFO message");
            logger.debug("Some DEBUG message");


            boolean isNull = checkForNull();
            logger.debug("IsNull:" + isNull);
        }

        public static boolean checkForNull() {
//        while(running)
            try {
                String name = null;
                if(!name.equals("null")){
                    return true;
                }
            } catch(Exception e) {
                logger.warn("Caught an exception", e);
            }
            return false;
        }
    }


