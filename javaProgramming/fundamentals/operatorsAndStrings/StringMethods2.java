/*
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding String methods
*/

public class StringMethods2
{
   public static void main(String[] args)
   {
      // The charAt(para) method returns the character at the specified index
      // Note: the first character is located at position 0
      //       last character = string length - 1
      
      String courseCode = "ICT2010";
      byte lenCourseCode = (byte)(courseCode.length());
      
      System.out.printf("course code: %s\n", courseCode.substring(0)); // note the substring() method is discussed below
      System.out.printf("length of course code: %d\n", lenCourseCode);
      System.out.printf("first character of course code: %s\n", courseCode.charAt(0));
      System.out.printf("last character  of course code is at index: %d\n", (lenCourseCode - 1));
      
      // The substring(para,para(optional)) method   
      // returns a copy of a string starting from the startPosition   
      // until the end of the string
      System.out.printf("course name is: %s\n", courseCode.substring(0,3));  // note when you indicate the end position e.g (0,3) the charAt(3) is not ignored
      System.out.printf("course number is: %s\n", courseCode.substring(3));
      
      // The indexOf("para") method returns the indexPosition(int) the first occurrence of the substring str
      // returns -1 if the string is not found
      // note index0f() is case sensitive
      System.out.printf("middle character of course code is at index: %d\n", courseCode.indexOf("2010")); // note you can pass indexOf() a single char or a substring of which it will return the index of the first character in that substring
      
      // The replace(char/str find, char/str replace) method
      // creates and returns a string in which every occurence of 'char find' is replaced with 'char replace'
      // if the character to be replaced is not found it returns the original string.
      System.out.printf("%s Fundamentals of Software Engineering, is a third year course at unza.\n", courseCode.replace('2','3'));
      System.out.printf("%s Projects in ICTs is a fourth year course at unza.\n", courseCode.replace("2010", "4014"));
   }
     
}
