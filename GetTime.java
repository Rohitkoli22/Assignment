import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GetTime {
    public List<String> getTime() { //geting the time from time card column
        String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
        String line="";
        List<String> l1=new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line=br.readLine();
            line=br.readLine();
            while ((line = br.readLine()) != null) {
                String[] Values=line.split(",");
                String[] Val=Values[4].split(" ");
                l1.add(Val[0]);
            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  

        return l1;
        

    }
}
