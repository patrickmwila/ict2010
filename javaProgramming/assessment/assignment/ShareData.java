/**
 * Author      : Banda Esther  - 2019002922
 *             : Mwila Patrick - 2019037459
 * Instructor  : Phyela Mbewe
 * Date        : 27-09-2021
 * Description : A program that allows mobile phone users to send data to other users
 */
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.io.File;
import java.io.IOException;


public class ShareData 
{
   public static void main (String [] args) throws IOException
   {
      // create Scanner object to get input from the keyboard
      Scanner keyboard = new Scanner(System.in);

      System.out.println (
         "Welcome to ZC mobile Data Sharing" + 
         "\n---------------------------------" +
         "\n1 - Send Data" +
         "\n2 - Check Balance" +
         "\n3 - Receive Free Gift" +
         "\n0 - Exit"     
      );
      int userOpt = keyboard.nextInt();

      // create a File Object to hold the file to be read from
      File file = new File("customers.txt");

      // create Scanner object to read from the file 
      Scanner inputFile = new Scanner(file);

      // line variable keeps track of lines in a file
      int line = 1;

      // carry out the following actions based on the option selected
      if (userOpt == 1)
      {
          // clean the keyboards buffer
          keyboard.nextLine();

          // prompt for user input
          System.out.println("Enter Phone Number");
          String phoneNum = keyboard.nextLine();

          System.out.println("Enter Data Amount in Megabytes");
          int dataBundles = keyboard.nextInt();

          // read the entire file
          while (inputFile.hasNextLine())
          {
              String str = inputFile.nextLine();
              String strPhone = str.substring(0,7);

              // compare phone number in file with user phone number
              if (line == 1)
              {
                  if (phoneNum.equals(strPhone))
                  {
                      System.out.println(
                          "You cannot send data to yourself"
                      );
                      System.exit(0);
                  }

              }
              
              else if (line > 1)
              {
                  if ( !(phoneNum.equals(strPhone)))
                  {
                      System.out.println(
                          "Sorry, customer not found, data could not be sent"
                      );
                      System.exit(0);
                  }

                  else 
                  {
                      String name = str.substring(8, (str.length() - 4));
                      int strLen = str.length();

                      System.out.println(
                          "Success, you have sent " + dataBundles + 
                          "mb to " + name
                      );
                      System.exit(0);
                  }
              }
              line ++;
          }    
      }
      
      else if (userOpt == 2)
      {

          // get the length of the first line in the file
          String str = inputFile.nextLine();
          int strLen = str.length();

          // get the mbs from the first line in the file
          String mbs = str.substring((strLen - 4), strLen);

          // display the current amount of data
          System.out.println("Your current data amount is " + mbs + "mb");
      }

      else if (userOpt == 3)
      {
          // create a Date and SimpleDateFormat object's
          Date date = new Date();
          SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

          // get the current system time
          String sysTime = formatter.format(date); 

          // get the first 2 values indicating the hours from sysTime
          int currentTime = Integer.parseInt(sysTime.substring(0,2));
          
          // check if system time is between 18:00 and 21:00 hrs
          if (currentTime > 18 && currentTime < 21)
          {
              System.out.println(
                  "You have received 150mb of data as a free gift"
              );
          }
          else
          {
              System.out.println(
                  "You have received 75mb of data as a free gift"
              );
          }
      }

      else if (userOpt == 0)
      {
          // exit the program
          System.exit(0);
      }

      // clear the rams buffer
      inputFile.close();
      keyboard.close();
   }
}
