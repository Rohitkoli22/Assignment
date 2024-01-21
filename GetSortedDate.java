import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetSortedDate {
    public List<String> getSorted(int index,int count) { // Getting the sorted date from the time in column
        GetDate g2=new GetDate();
        List<String> l4=g2.getDate();
        List<String> l5=new ArrayList<String>();
        List<String> l6=new ArrayList<String>();
        // for(String s1:l4)
        // {
        //     System.out.println(s1);
        // }
        int tcount=index+count;
        for(int i=index;i<tcount;i++)
        {
            l5.add(l4.get(i));
        }
        int flag=0;
        l6.add(l5.get(0));
        for(String s1:l5)
        {
            for(String s2:l6)
            {
                if(s1.equals(s2))
                {
                    flag=0;
                    break;
                }
                else{
                    flag=1;
                }
            }
            if(flag==1)
            {
                l6.add(s1);
            }
        }

    return l6;


    }
}
