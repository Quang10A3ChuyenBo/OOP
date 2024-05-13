package org.godotengine.godot;

public class MyGodotJavaClass {
    static {
        System.loadLibrary("godot_jni");
    }

    public static native void myMethod();
}
