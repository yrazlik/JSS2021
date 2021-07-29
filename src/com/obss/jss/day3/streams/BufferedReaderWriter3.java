package com.obss.jss.day3.streams;

import java.io.*;

public class BufferedReaderWriter3 {

    public static void main(String[] args) throws IOException {
        readFile();
        writeToFile();
    }

    private static void readFile() throws IOException {
        FileReader fr = new FileReader("/Users/yrazlik/IdeaProjects/JavaSummerSchool/src/com/obss/jss/day3/streams/bufferedreader.txt");
        BufferedReader br = new BufferedReader(fr);

        try {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }
        } finally {
            br.close();
            fr.close();
        }
    }

    private static void writeToFile() throws IOException {
        FileWriter fr = new FileWriter(
                "/Users/yrazlik/IdeaProjects/JavaSummerSchool/src/com/obss/jss/day3/streams/bufferedreader.txt",
                true);
        BufferedWriter br = new BufferedWriter(fr);

        try {
            br.newLine();
            br.append("new line 1");
            br.newLine();
            br.append("new line 2");
            br.flush();
        } finally {
            br.close();
            fr.close();
        }
    }
}
