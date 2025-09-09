package com.java.patterns.patterns.chainofresponsibility;

public class ErrorLogProcessor extends LoggerProcessor{

    ErrorLogProcessor(LoggerProcessor nextLoggerProcessor){
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println("Error log");
        } else{
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
