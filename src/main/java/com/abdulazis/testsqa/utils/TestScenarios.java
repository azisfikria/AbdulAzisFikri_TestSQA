package com.abdulazis.testsqa.utils;

public enum TestScenarios {

    T1("user di halaman beranda tokopedia");




    private String testName;

    TestScenarios(String value) {

        testName = value;
    }

    public String getTestName() {

        return testName;
    }
}
