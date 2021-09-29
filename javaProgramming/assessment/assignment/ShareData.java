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

      // count variable keeps track of lines in a file
      int line = 1;

      // carry out the following actions based on the option selected
      if (userOpt == 1)
      {
          // clean the keyboards buffer
          keyboard.nextLine();

          // prompt for user input
          System.out.println("Enter Phone Number e.g (9329492)");
          String phoneNum = keyboard.nextLine();

          System.out.println("Enter Data Amount in Megabytes");
          int dataBundles = keyboard.nextInt();

          // get the length of the first line in the file
          String str = inputFile.nextLine();
          int strLen = str.length();

          // get the mbs from the first line in the file
          String mbs = str.substring((strLen - 3), strLen);
          int mbsInt = Integer.parseInt(mbs);

          // validate data amount input
          while (dataBundles < 0 || dataBundles > mbsInt)
          {
              System.out.println(
                  "Please enter a valid data amount to send"
              );
              dataBundles = keyboard.nextInt();
          }

         
          if (line == 1)
          {
              // get the phone number of the first line in the file
              String strPhone = str.substring(0,7);

              // check if phoneNum = strPhone
              if (phoneNum.equals(strPhone))
              {
                  System.out.println(
                      "You cannot send data to yourself"
                  );
              }
          }

          while (inputFile.hasNextLine())
          {
              // get the phone number of the first line in the file
              str = inputFile.nextLine();
              String strPhone = str.substring(0,7);
              String name = str.substring(8, (str.length() - 4));

              // check if phoneNum = strPhone
              if ( !(phoneNum.equals(strPhone)) )
              {
                  System.out.println(
                      "Sorry, customer not found, data could not be sent"
                  );

                  // exit
                  System.exit(-1);
              }

              else if (phoneNum.equals(strPhone))
              {
                  System.out.println(
                      "Success, you have sent " + dataBundles + 
                      "mb to " + name
                  );
                  System.exit(0);
              }
          }
      }

      else if (userOpt == 2)
      {

          // read from the file 'customers.txt'
          while (inputFile.hasNextLine())
          {
              // get the length of the first line in the file
              String str = inputFile.nextLine();
              int strLen = str.length();

              // get the mbs from the first line in the file
              String mbs = str.substring((strLen - 4), strLen);

              // display the current amount of data
              System.out.println("Your current data amount is " + mbs + "mb");

              break;
          }
      }

      else if (userOpt == 3)
      {
          // create a Date object
          Date date = new Date();
          SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

          String sysTime = formatter.format(date); 

          // get the first 2 values indicating the hours from sysTime
          int checkTime = Integer.parseInt(sysTime.substring(0,2));
          

          // check if system time is between 18:00 and 21:00 hrs
          if (checkTime > 18 && checkTime < 21)
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
