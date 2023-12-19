package com.Project.springbootdocker;
public class JavaVersionFinder {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");

        System.out.println("Java Version: " + javaVersion);
        System.out.println("Java Vendor: " + javaVendor);
    }
}
