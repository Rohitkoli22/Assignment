

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GetID {
    public List<String> getIDWD() // Getting the ID values from id column without duplicate values
    {
        String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
        String line="";
        List<String> l1=new ArrayList<String>();
        List<String> l2=new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line=br.readLine();
            while ((line = br.readLine()) != null) {
                String[] Values=line.split(",");
                l1.add(Values[0]);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        int flag=0;
        l2.add(l1.get(0));
        for(String s1:l1)
        {
            for(String s2:l2)
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
                l2.add(s1);
            }
        }
       return l2;
    }
    public List<String> getID() //Getting the ID values from id column with duplicate values
    {
        String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
        String line="";
        List<String> l1=new ArrayList<String>();
        List<String> l2=new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line=br.readLine();
            while ((line = br.readLine()) != null) {
                String[] Values=line.split(",");
                l1.add(Values[0]);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        int flag=0;
      
       return l1;
    }
}
