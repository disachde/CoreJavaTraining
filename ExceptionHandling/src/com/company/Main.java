package com.company;

import java.io.*;
import java.util.Scanner;

/*
Write a program that prompts the user to enter two filenames and then copy the first (which is presumed to exist) into the second (which probably doesn't exist).

If the first file does not exist, the program should print a message to that effect, loop round and ask for the input filename again (avoid re-prompting for the output filename).

If the first file does exist, the program should copy the contents of the first file into the second file. However, if any IO problems arise (for example, attempts to create an output file in a non-existent directory, or lack of permission), then the problem should be reported, and the program should re-prompt for the output file (but not the input filename.)

After one file has been successfully copied, the program should exit.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        boolean flag = true;
        boolean destinationFlag = true;
        String destinationName = null;
        String sourceName = null;


            do {

                FileReader source = null;
                FileWriter destination = null;

            System.out.println("Enter the source filename");
            Scanner sc = new Scanner(System.in);
            sourceName = sc.nextLine();

                if(destinationFlag) {
                    System.out.println("Enter the destination filename");
                    destinationName = sc.nextLine();
                    destinationFlag = false;
                }


            try
            {
                source = new FileReader(sourceName);
                destination = new FileWriter(destinationName);
                int count = source.read();
                while(count!=-1)
                {
                    destination.write(count);
                    count = source.read();
                }
                System.out.println("Contents copied");
            }

            catch (FileNotFoundException e)
            {
                System.out.println("Can't find file \"" + sourceName + "\".");
                flag = false;
            }

            catch (IOException e)
            {
                  e.printStackTrace();
            }
                finally {
                close (source);
                close (destination);
            }
        }while(!flag);
    }

    public static void close(Closeable stream)
    {
        try
        {
            if (stream!=null)
            {
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
