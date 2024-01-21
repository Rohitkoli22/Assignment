import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertToDate {
    public int getData(String s) // Converting the date format 
    {
         for(int i=0;i<s.length();i++)
         {
            if(s.charAt(i) == '-')
            {
               s= s.substring(0, i)+ '/' + s.substring(i+1);
            }
         }
         String[] s1=s.split("/") ; 
         int val=0;
         try{
         val=Integer.parseInt(s1[1]);
         }
         catch(Exception e)
         {

         }
         return val;
    }
}
