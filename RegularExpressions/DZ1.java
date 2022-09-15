package com.kda.RegularExpressions;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("out", "Time.txt");
        File file = Path.of("out", "resultTimeOne").toFile();
        StringBuilder stBuld = new StringBuilder();

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                stBuld.append(scanner.next());
            }
        }
        Pattern pattern = Pattern.compile("(\\d{2}\\W\\d{2})(\\D*)(\\d{2}\\W\\d{2})(\\D*)");
        Matcher matcher = pattern.matcher(stBuld);
        String stTime = "";
        String stHZ = "";
        int count = 0;
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            while (matcher.find()) {
                if (count < 1) {
                    outputStream.write((matcher.group(1) + "-" + matcher.group(3) + " " + matcher.group(2)).getBytes());
                    outputStream.write("\n".getBytes());
                    stTime = matcher.group(3);
                    stHZ = matcher.group(4);
                    count++;
                } else {
                    String end = stTime + "-" + matcher.group(1) + " " + stHZ;
                    outputStream.write(end.getBytes());
                    outputStream.write("\n".getBytes());
                    outputStream.write((matcher.group(1) + "-" + matcher.group(3) + " " + matcher.group(2)).getBytes());
                    outputStream.write("\n".getBytes());
                    count--;
                }
            }
        }
    }
}
