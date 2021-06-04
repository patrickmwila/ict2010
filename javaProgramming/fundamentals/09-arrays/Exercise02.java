/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 04/06/2021
 * Description: Displaying elements of a 2D arrays using while loops
 */

public class Exercise02
{
    public static void main(String[] args)
    {
        String[][] var_users = {{"Name: Jane", "Age: 20", "Sex: F"},
                                {"Name: Bill", "Age: 19", "Sex: M"}};

        byte row = 0,
             col = 0;

        while(row < var_users.length)
        {
            while(col < var_users[row].length)
            {
                System.out.print("| " + var_users[row][col] + " ");
                col ++;
            }
            System.out.println(); // display a blank line after each row

            col = 0; // reset the value of col
            row++;   // increment row by one
        }
    }
}
