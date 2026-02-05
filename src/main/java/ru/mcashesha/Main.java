package ru.mcashesha;

import java.util.stream.IntStream;

public class Main {

    static final int N = 10_000_000;

    static final boolean USE_FLOAT = System.getProperty("arrayType", "double").equalsIgnoreCase("float");

    public static void main(String[] args) {

        double sum, step = 2.0 * Math.PI / (N -1);

        if (USE_FLOAT) {
            sum = IntStream.range(0, N)
                .parallel()
                .mapToDouble(i -> (float) Math.sin(step * i))
                .sum();

        } else {
            sum = IntStream.range(0, N)
                .parallel()
                .mapToDouble(i -> Math.sin(step * i))
                .sum();
        }


        System.out.printf("Type: %s%n", USE_FLOAT ? "float" : "double");
        System.out.printf("N: %d%n", N);
        System.out.printf("Sum: %.17g%n", sum);
    }
}
