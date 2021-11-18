/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab11 question 1
 */

public class ABString
{
    public boolean isAbecedarian(String str)
    {
        // assume the string is abecedarian
        boolean strFlag = true;

        for (int i = 0; i < str.length() - 1; i++)
        {
            if (str.substring(i, (i + 1)).compareTo(str.substring(i+1, i+2)) > 0)
            {
                strFlag = false;
            }
        }

        return strFlag;
    }
}
