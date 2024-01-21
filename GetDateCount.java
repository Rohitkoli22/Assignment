import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetDateCount {
    public int getCount(int a)
    {
        Scanner sc=new Scanner(System.in); // Getting the count of date the emp has worked for checking the 7 consecative day work
        int x=a;
        GetID g1=new GetID();
        List<String> l3=g1.getID();
        int count=0;
        String val=l3.get(x);
        for(int i=x;i<l3.size();i++)
        {
            String val2=l3.get(i);
            if(val.equals(val2))
            {
                count++;
            }
            else{
                break;
            }

        }
        return count;
    }
}
 