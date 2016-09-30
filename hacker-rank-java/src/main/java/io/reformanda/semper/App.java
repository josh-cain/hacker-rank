package io.reformanda.semper;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int gridSize = scanner.nextInt();

        final char[][] chars = new char[gridSize][gridSize];
        int row = 0;
        while (scanner.hasNext()) {
            chars[row] = (scanner.next().toCharArray());
            row++;
        }

        Map.Entry<Integer, Integer> princessLocation = null;
        Map.Entry<Integer, Integer> botLocation = null;
        // inefficient (always 0(n^2)), but meh - not the point of this exercise
        for (int y = 0; y < gridSize; y++) {
            for (int x = 0; x < gridSize; x++) {
                if (chars[y][x] == 'p') {
                    princessLocation = new AbstractMap.SimpleImmutableEntry<>(x, y);
                } else if (chars[y][x] == 'm') {
                    botLocation = new AbstractMap.SimpleImmutableEntry<>(x, y);
                }
            }
        }

        final StringBuilder output = new StringBuilder();

        // more ineffeciencies - again not the point though...
        while (botLocation.getKey() > princessLocation.getKey()) {
            output.append("LEFT\n");
            botLocation = new AbstractMap.SimpleImmutableEntry<>(botLocation.getKey() - 1, botLocation.getValue());
        }
        while (botLocation.getKey() < princessLocation.getKey()) {
            output.append("RIGHT\n");
            botLocation = new AbstractMap.SimpleImmutableEntry<>(botLocation.getKey() + 1, botLocation.getValue());
        }
        while (botLocation.getValue() > princessLocation.getValue()) {
            output.append("UP\n");
            botLocation = new AbstractMap.SimpleImmutableEntry<>(botLocation.getKey(), botLocation.getValue() - 1);
        }
        while (botLocation.getValue() < princessLocation.getValue()) {
            output.append("DOWN\n");
            botLocation = new AbstractMap.SimpleImmutableEntry<>(botLocation.getKey(), botLocation.getValue() + 1);
        }
        System.out.print(output.toString());
    }

}
