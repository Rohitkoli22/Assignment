import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GetName {
    public List<String> getName() // Getting the name values form name column
    {
        String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
        String line="";
        List<String> l1=new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line=br.readLine();
            while ((line = br.readLine()) != null) {
                String[] Values=line.split(",");
                String Val=Values[7]+Values[8];
                l1.add(Val);
            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  
        return l1;
    }
    public List<String> getNameWD()
    {
        String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
        String line="";
        List<String> l1=new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line=br.readLine();
            while ((line = br.readLine()) != null) {
                String[] Values=line.split(",");
                String Val=Values[7]+Values[8];
                int flag=0;
                        for(String s:l1)
                        {
                            if(s.equals(Val))
                            {
                                flag=1;
                            }
                        }
                        if(flag == 0)
                        {
                            l1.add(Val);
                            l1.add(Val);
                        }
            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  
        return l1;
    }
}
