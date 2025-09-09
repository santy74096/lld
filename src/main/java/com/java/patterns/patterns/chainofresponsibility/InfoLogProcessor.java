package com.java.patterns.patterns.chainofresponsibility;

public class InfoLogProcessor extends LoggerProcessor{

    InfoLogProcessor(LoggerProcessor nextLoggerProcessor){
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("Info log");
        } else{
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
