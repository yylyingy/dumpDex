package com.wrbug.dumpdex;

/**
 * Native
 *
 * @author suanlafen
 * @since 2018/3/23
 */
public class Native {

    static {
        System.load("/data/local/tmp/libnativeDump.so");
//        System.loadLibrary("nativeDump");
    }

    public static native void dump(String packageName);
}
