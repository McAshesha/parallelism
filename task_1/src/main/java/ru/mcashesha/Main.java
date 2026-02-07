package ru.mcashesha;

import java.io.IOException;
import java.util.Properties;
import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;

public class Main {

    static final int SIZE = 10_000_000;

    static final boolean USE_FLOAT;

    static {
        try (var is = Main.class.getResourceAsStream("/build.properties")) {
            Properties props = new Properties();
            props.load(is);
            USE_FLOAT = props.getProperty("array.type", "double").equalsIgnoreCase("float");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        System.out.printf("Type: %s%n", USE_FLOAT ? "float" : "double");
        System.out.printf("Size: %d%n", SIZE);

        double sum, step = 2.0 * Math.PI / (SIZE -1);

        IntToDoubleFunction function = USE_FLOAT
            ? i -> (float) Math.sin(step * i)
            : i -> Math.sin(step * i);

        sum = IntStream.range(0, SIZE)
                .parallel()
                .mapToDouble(function)
                .sum();

        System.out.printf("Sum: %.26f%n", sum);
    }
}
