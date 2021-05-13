public class Bugs
{
   public static void main(String[] args)
   {
      String name1 = "PATRICK",
             name2 = "patrick",
             name3 = "patrick",
             name4 = name1.toLowerCase();
      
      // predict the output
      System.out.println(name4 == name3); // == operator returns a boolean (True or False)
    }
}