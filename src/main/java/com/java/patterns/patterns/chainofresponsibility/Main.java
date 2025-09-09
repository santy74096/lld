package com.java.patterns.patterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        LoggerProcessor loggerProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        loggerProcessor.log(1, "logger");
    }
}
