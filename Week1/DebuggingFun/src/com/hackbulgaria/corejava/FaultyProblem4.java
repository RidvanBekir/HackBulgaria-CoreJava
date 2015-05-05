package com.hackbulgaria.corejava;

public class FaultyProblem4 {
    public static boolean areEqual(Integer e, Integer k) {
        return e.equals(k);
    }

    public static boolean areEqual(float a, float b) {

        return Math.abs(a - b) < 0.01;

    }

    /**
     * Return whether there is an index <b>i</b>, such that a[i,a.length] equals
     * b[i, a.length];
     * 
     * @param a
     * @param b
     * @return
     */
    public static boolean haveEqualSubstrings(String a, String b) {

        return a.contains(b);
        
    }
}
