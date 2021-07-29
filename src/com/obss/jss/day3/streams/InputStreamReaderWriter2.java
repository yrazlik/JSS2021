package com.obss.jss.day3.streams;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamReaderWriter2 {

    public static void main(String[] args) throws IOException {
        readFile();
        writeToFile();
    }

    private static void readFile() throws IOException {

        FileInputStream inputStream = new FileInputStream("/Users/yrazlik/IdeaProjects/JavaSummerSchool/src/com/obss/jss/day3/streams/inputstreamreader.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));

        try {
            int data = inputStreamReader.read();
            while(data != -1){
                char theChar = (char) data;
                data = inputStreamReader.read();
                System.out.println(theChar);
            }
        } catch (Exception e) {
            System.err.println("An error occured: " + e.toString());
        } finally {
            if(inputStreamReader != null) {
                inputStreamReader.close();
            }
        }
    }

    private static void writeToFile() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("/Users/yrazlik/IdeaProjects/JavaSummerSchool/src/com/obss/jss/day3/streams/inputstreamreader.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.forName("UTF-8"));

        try {
            outputStreamWriter.append("ççççç");
           // outputStreamWriter.write("ööö");
            outputStreamWriter.flush();
        } catch (Exception e) {
            System.err.println("An error occured: " + e.toString());
        } finally {
            if(outputStreamWriter != null) {
                outputStreamWriter.close();
            }
        }
    }
}
