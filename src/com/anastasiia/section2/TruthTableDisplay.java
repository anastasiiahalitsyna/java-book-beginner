package com.anastasiia.section2;

public class TruthTableDisplay {

    public static final String FORMAT = "|%-6s|%-6s|%-6s|%-6s|%-6s|%-6s|\n";
    public static final String ROW_SEPARATOR = "-------------------------------------------";

    public static void main(String[] args) {
        printRowSeparator();
        System.out.printf(FORMAT, "  P", "  Q", "  AND", "  OR", "  XOR", "  NOT");
        printRowSeparator();

        printRowValues(true, true);
        printRowValues(true, false);
        printRowValues(false, true);
        printRowValues(false, false);
    }


    public static void printRowValues(boolean p, boolean g) {
        System.out.printf(FORMAT, p, g, p & g, p | g, p ^ g, !p);
        printRowSeparator();
    }

    public static void printRowSeparator() {
        System.out.println(ROW_SEPARATOR);
    }

}
