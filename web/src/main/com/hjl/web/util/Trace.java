package com.hjl.web.util;

/**
 * @author: HJL
 * @create: 2019-01-18 11:30
 */
public class Trace {

    private static ThreadLocal<String> trace = new ThreadLocal<>();

    public static void setTrace(String str) {
        trace.set(str);
    }

    public static String tracestr() {
        return trace.get();
    }
}
