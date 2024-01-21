
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment1{
    public static void main(String[] args)
    {
        GetID g1=new GetID();
        GetDate g2=new GetDate();
        ConvertToDate c1=new ConvertToDate();
        GetTime g3=new GetTime();
        ConvertToTime c2=new ConvertToTime();
        GetDateCount gd=new GetDateCount();
        GetSortedDate gs=new GetSortedDate();
        GetName gn=new GetName();
        GetPosition gp =new GetPosition();
        GetShiftTime gst=new GetShiftTime();
        try{
            List<String> l1=gn.getName(); // Getting the the total values of name column
            List<String> l2=gp.getPosition(); // Getting the the total values of Position column
            List<String> l3=g1.getID(); // Getting the the total values of ID column
            List<String> l4=g2.getDate();// Getting the the total values of time in column
            List<String> result=new ArrayList<String>();// for storing the result id



            // Getting the id of the emp who has worked 7 consecative days
            int count=0;
            outer:
            for(int i=0;i<l4.size();i++)
            {
               String Val1=l3.get(i);
               int d1=c1.getData(l4.get(i)); // getting the converted date value
               if(d1==0)
               {
                continue;
               }
               else 
               {
                int dcount=gd.getCount(i);
                    List<String> l=gs.getSorted(i, dcount);
                    inner:
                    for(int j=d1,k=i,p=0;j<=(d1+7);j++,k++,p++)
                    {
                        if(p>=l.size() || k>=l3.size())
                        {
                            break inner;
                        }
                        int date=c1.getData(l.get(p));
                        String Val2=l3.get(k);
                       // System.out.println(Val1+"\t\t"+Val2+"\t\t"+j+"\t\t"+date);
                        if(Val1.equals(Val2) && j==date)
                        {
                            count++;
                        }
                        else{
                            count=0;
                            break inner;
                        }
                    }
               
               }
               if(count>=7)
               {
                int flag=0;
                    for(String s:result)
                    {
                        if(s.equals(Val1))
                        {
                            flag=1;
                        }
                    }
                    if(flag == 0)
                    {
                        result.add(Val1);
                    }
                count=0;
               }
               else{
                count=0;
               }
            }
            // for(String s:result)
            // {
            //     System.out.println(s);
            // }
            // System.out.println(result.size());



// Here getting the emp id who has > 1 & <10 hoours of gap between shifts


            List<String> l5=new ArrayList<String>();
            l5=gst.getShiftTime(); // getting the time in column values 
            List<String> l55=new ArrayList<String>();
            l55=gst.getShiftTimeOut(); // getting the time out column values

            // for(String s:l5)
            // {
            //     System.out.println(s);
            // }
            for(int i=0;i<l5.size()-3;i=i+2)
            {
                String v1,v2;
                v1=l3.get(i);
                v2=l3.get(i+1);
                String dval1=l55.get(i);
                String dval2=l5.get(i+1);
                if(dval1=="" || dval2=="")
                {
                    continue;
                }
                Date t1=c2.getTimeData(dval1); 
                Date t2=c2.getTimeData(dval2);
                Date t3=c2.getTimeData("01:00");
                Date t4=c2.getTimeData("10:00");
                if(v1.equals(v2) && (t2.getHours()-t1.getHours())>t3.getHours() && (t2.getHours()-t1.getHours())<t4.getHours())
                {
                    int flag=0;
                    for(String s:result)
                    {
                        if(s.equals(v1))
                        {
                            flag=1;
                        }
                    }
                    if(flag == 0)
                    {
                        result.add(v1);
                    }
                }

            }
            // System.out.println(result.size());
            // for(String s:result)
            // {
            //     System.out.println(s);
            // }


            // Here the last emp who has worked for greater than 14 hours

            List<String> l6=new ArrayList<String>();
            l6=g3.getTime();

            for(int i=0;i<l6.size();i++)
            {
                
                
                String v1;
                v1=l3.get(i);
                String dateval=l6.get(i);
                if(dateval=="")
                {
                    continue;
                }
                Date t1=c2.getTimeData(dateval); 
                Date t3=c2.getTimeData("14:00");
                //System.out.println(i+"\t\t"+t1.getHours()+"\t\t\t"+t3.getHours());
                if((t1.getHours())>t3.getHours())
                {
                    int flag=0;
                    for(String s:result)
                    {
                        if(s.equals(v1))
                        {
                            flag=1;
                        }
                    }
                    if(flag == 0)
                    {
                        result.add(v1);
                    }
                }

            }
            // System.out.println(result.size());
            // for(String s:result)
            // {
            //     System.out.println(s);
            // }


        // Getting the Name and position of emp according to result id list
            List<String> FinalName=new ArrayList<String>();
            List<String> FinalPosition=new ArrayList<String>();

            for(int i=0;i<result.size();i++)
            {
                for(int j=0;j<l3.size();j++)
                {
                    try{
                    String check1=result.get(i);
                    String check2=l3.get(j);
                    
                    
                    if(check1.equals(check2))
                    {
                        String NameVal=l1.get(j);
                        String PositionVal=l2.get(j);
                        int flag=0;
                        for(String s:FinalName)
                        {
                            if(s.equals(NameVal))
                            {
                                flag=1;
                            }
                        }
                        if(flag == 0)
                        {
                            FinalName.add(NameVal);
                            FinalPosition.add(PositionVal);
                        }
                        
                       
                    }
                }
                    catch(Exception e)
                    {
                        
                    }
                }
            }
// printing the id position and name of emp 
            for(int i=0;i<FinalName.size();i++)
            {
                try{
                System.out.println(result.get(i)+"\t\t\t"+FinalPosition.get(i)+"\t\t\t"+FinalName.get(i));
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





       
        
    }
}