
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GetDate{
    // public List<String> getDateWD() {
    //     String path = "E:/ROHIT/Assignment/Assignment_Timecard.csv";
    //     String line="";
    //     List<String> l1=new ArrayList<String>();
    //     List<String> l2=new ArrayList<String>();
    //     try{
    //         BufferedReader br = new BufferedReader(new FileReader(path));
    //         line=br.readLine();
    //         String[] Values1=line.split(",");
    //         String[] Val=Values1[2].split(" ");
    //         l1.add(Val[0]);
    //         while ((line = br.readLine()) != null) {
    //             String[] Values=line.split(",");
    //             Val=Values[2].split(" ");
    //             l1.add(Val[0]);
            
    //         }
    //     }
    //     catch(Exception e)
    //     {
    //         e.printStackTrace();
    //     }  

    //     int flag=0;
    //     l2.add(l1.get(0));
    //     for(String s1:l1)
    //     {
    //         for(String s2:l2)
    //         {
    //             if(s1.equals(s2))
    //             {
    //                 flag=0;
    //                 break;
    //             }
    //             else{
    //                 flag=1;
    //             }
    //         }
    //         if(flag==1)
    //         {
    //             l2.add(s1);
    //         }
    //     }

    //     return l2;
        

    // }
    public List<String> getDate() { // Getting the date separately in time in column
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
                String[] Values=line.split(",");
                Val=Values[2].split(" ");
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
