package com.opensource.jiangbiao.behavior.chainofresponsibility;

public class Demo {


    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger debug = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        error.setNextLogger(debug);
        debug.setNextLogger(console);
        return error;
    }



    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"This is info level");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is debug level");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is error level");

    }
}
