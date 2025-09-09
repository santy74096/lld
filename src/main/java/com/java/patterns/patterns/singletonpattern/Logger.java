package com.java.patterns.patterns.singletonpattern;

import java.io.Serializable;

public class Logger implements Serializable {

    private static volatile Logger logger = null;

    private Logger(){}

    public static Logger getLogger(){
        if(logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
