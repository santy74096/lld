package com.java.patterns.patterns.chainofresponsibility;

public class DebugLogProcessor extends LoggerProcessor{

    DebugLogProcessor(LoggerProcessor nextLoggerProcessor){
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("Debug log");
        } else{
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
