import java.util.*;          // for Scanner

import java.io.*;            // for FileReader

public class AccountDetails {

     public static void main (String [] args) throws IOException  { 

           Scanner read = new Scanner(new FileReader("names.txt"));

           String name;

           int number;

           while (read.hasNextLine()) {

                  name = read.next();  // read from file,

                  number = read.nextInt(); // read each line using a loop

                  if (number > 8100) {

                           System.out.println(name + " " + number);

                  }

           }

           read.close();  // stop reading from file

      }

 }
