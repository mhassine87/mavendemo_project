package com.example.mavenjavatest.test;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger LogLog = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calc cal = new Calc();
        LogLog.debug(cal.add(3,4));
        LogLog.debug(cal.mult(5,4));
        LogLog.debug(cal.substract(10,4));
        LogLog.debug(cal.div(20,4));
    }


}
