package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        String[] splitWords = {};
        HashMap <String, Integer> wordMap = new HashMap <String, Integer>();
        Charset charset = Charset.forName("UTF-8");
        Path inputFile = Paths.get("pg42671.txt");
        try (BufferedReader reader = Files.newBufferedReader(inputFile, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                splitWords=line.split("\\W+");
                //System.out.println(line);
                for(String word:splitWords)
                {
                    word=word.toLowerCase();
                    if(wordMap.containsKey(word))
                    {
                        int count = wordMap.get(word);
                        count++;
                        wordMap.put(word,count);
                    }
                    else
                    {
                        wordMap.put(word, 1);
                    }
                }
            }
        }
        catch (IOException x)
        {
            System.err.format("IOException: %s%n", x);
        }

        for (String word: wordMap.keySet())
        {
            int value = wordMap.get(word);
            System.out.println("Word "+word +" occurs " +value+" times");

        }
    }
}

