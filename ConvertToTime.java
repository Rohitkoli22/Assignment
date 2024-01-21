import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertToTime {
    public Date getTimeData(String s) //Converting the time format
    {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
        Date d= new Date();
        try{
        d=dateFormat.parse(s);
        }
        catch(Exception e)
        {

        }
        return d;
    }
}
