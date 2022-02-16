package challenge1;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        int n = 6;

        int espaces;

        String asterisks = "*";

        String espace = " ";

        for (int i = 1; i <= n; i++) {
            espaces = n - i;
            System.out.println(espace.repeat(espaces) + asterisks.repeat(i));
        }

    }
}