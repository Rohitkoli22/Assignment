import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GetShiftTime {
    public List<String> getShiftTime() { //Getting time from time in column value
        String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
        String line="";
        List<String> l1=new ArrayList<String>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line=br.readLine();
            line=br.readLine();
            String[] Values1=line.split(",");
            String[] Val=Values1[2].split(" ");
            l1.add(Val[0]);
            while ((line = br.readLine()) != null) {
                try{
                String[] Values=line.split(",");
                Val=Values[2].split(" ");
                l1.add(Val[1]);
                }
                catch(Exception e)
                {

                }
            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  

       

        return l1;

    }
    public List<String> getShiftTimeOut() { // Getting time from time out column value
        String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
        String line="";
        List<String> l1=new ArrayList<String>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line=br.readLine();
            line=br.readLine();
            String[] Values1=line.split(",");
            String[] Val=Values1[2].split(" ");
            l1.add(Val[0]);
            while ((line = br.readLine()) != null) {
                try{
                String[] Values=line.split(",");
                Val=Values[3].split(" ");
                l1.add(Val[1]);
                }
                catch(Exception e)
                {
                    
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
