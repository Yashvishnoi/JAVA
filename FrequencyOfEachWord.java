
import java.util.Scanner;

public class FrequencyOfEachWord
{
    private static String[] FrequecyWord(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];

        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }           

            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;               
            }
            keyAlreadyExists = false;
        }       
        return uniqueKeys;
    }
    public static void main(String[] args)
    {       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String text = sc.nextLine();
        String[] keys = text.split(" ");
        String[] uniqueKeys;
        int count = 0;
        
        uniqueKeys = FrequecyWord(keys);

        for(String key: uniqueKeys)
        {
            if(null == key)
            {
                break;
            }           
            for(String s : keys)
            {
                if(key.equals(s))
                {
                    count++;
                }               
            }
            System.out.println("Number of  "+key+" is : "+count);
            count=0;
        }
    }

}