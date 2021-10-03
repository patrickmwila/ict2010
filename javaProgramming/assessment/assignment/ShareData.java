/**
 * Authors     : Mwila Patrick - 2019037459
 *             : Banda Esther  - 2019002922
 * Instructor  : Phyela Mbewe
 * Due Date    : 08-09-2021
 * Description : A program that allows mobile phone users to send data to other users
 */

import java.util.Scanner;
import java.util.Date;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;

import java.io.File;
import java.io.IOException;

public class ShareData 
{
   public static void main (String [] args) throws IOException
   {
      // create Scanner object to get input from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // display message, prompting for userInput...
      System.out.println (
         "Welcome to ZC mobile Data Sharing" + 
         "\n---------------------------------" +
         "\n1 - Send Data" +
         "\n2 - Check Balance" +
         "\n3 - Receive Free Gift" +
         "\n0 - Exit"     
      );
      int userOpt = 0;
      try
      {
          userOpt = keyboard.nextInt();
      }

      catch (InputMismatchException ex)
      {
          System.out.println(
              "Invalid option!"
          );
      }

      // create a File Object to open the file for reading
      File file = new File("customers.txt");

      // create a Scanner object to read from the file 
      Scanner inputFile = new Scanner(file);

      // carry out the following actions based on the option selected
      if (userOpt == 1)
      {
          // clean the keyboards buffer
          keyboard.nextLine();

          // prompt for user input
          System.out.println("\nEnter Phone Number");
          String phoneNum = keyboard.nextLine();

          System.out.println("Enter Data Amount in Megabytes");
          int dataBundles = 0;

          try 
          {
              dataBundles = keyboard.nextInt();
          }

          catch (InputMismatchException ex)
          {
              System.out.println(
                  "\nInvalid data amount!"
              );
              System.exit(0);
          }

          // read the entire file
          while (inputFile.hasNextLine())
          {
              // read a line from the file, at each iteration extracting phone number
              String line = inputFile.nextLine();
              String strPhone = line.substring(0,7);

              // check if user entered number is present in file
              if (phoneNum.equals(strPhone))
              {
                  // create Scanner object used to read firstLine only 
                  Scanner getFirstLine = new Scanner(file);

                  // get the length of the first line in the file
                  String firstLine = getFirstLine.nextLine();
                  int lineLength = firstLine.length();

                  // get the mbs from the first line in the file and convert to int
                  String mbs = firstLine.substring((lineLength - 3), lineLength);
                  int mbsInt = Integer.parseInt(mbs);

                  // validate data amount entered entered
                  while (dataBundles <= 0 || dataBundles > mbsInt)
                  {
                      System.out.println(
                          "\nPlease enter a valid data amount to send"
                      );
                      dataBundles = keyboard.nextInt();
                  }

                  // Scanner object used to read first line (again)
                  Scanner getFirstLine2 = new Scanner(file);
                  String line2 = getFirstLine2.nextLine();

                  if (phoneNum.equals(line2.substring(0,7)))
                  {
                      System.out.println(
                          "You cannot send data to yourself"
                      );
                      System.exit(0);
                  }

                  else 
                  {

                      String name = line.substring(8, (line.length() - 4));

                      System.out.println(
                          "Success, you have sent " + dataBundles + 
                          "mb to " + name
                      );
                      System.exit(0);
                  }
              }

              /*
                 if phone number entered != phone number on the current line 
                 of the file, "continue" i.e check the next Line
              */
              else
              {
                  continue;
              }
          }

          // if none of the above 'if blocks' exec, implies customer not found
          System.out.println(
              "Sorry, customer not found, data could not be sent"
          );
      }
      
      else if (userOpt == 2)
      {
          // get the length of the first line in the file
          String firstLine = inputFile.nextLine();
          int lineLength = firstLine.length();

          // get the mbs from the first line in the file
          String mbs = firstLine.substring((lineLength - 3), lineLength);

          // display the current amount of data
          System.out.println(
              "Your current data amount is " + mbs + "mb"
          );
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
          
          /*
             check if system time is between 18:00 and 21:00 hrs
             Note: The host system time should be in 24HR FORMAT
           */
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

      else 
      {
          System.out.println(
              "Invalid option!"
          );
      }

      /*
         clear the rams buffer
         Note: all Scanner objects reading from file, referece the address of 
         the same file object, this implies closing one will do the trick...
      */
      inputFile.close();
      keyboard.close();
   }
}
