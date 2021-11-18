/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab11 question 1
 */

public class ABStringTester
{
    public static void main(String[] str)
    {
        // create an abecedarian object
        ABString obj1 = new ABString();

        //display the results
        System.out.println(obj1.isAbecedarian("agnosy"));
        System.out.println(obj1.isAbecedarian("elephant"));
        System.out.println(obj1.isAbecedarian("biopsy"));
        System.out.println(obj1.isAbecedarian("zulu"));
        System.out.println(obj1.isAbecedarian("dimpy"));
    }
}
