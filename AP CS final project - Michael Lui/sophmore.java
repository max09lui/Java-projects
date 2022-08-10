import java.util.*;
public class sophmore extends students
{
    public String studentname, studentaddress, studentnumber;
    private int studentage;
    public ArrayList <Double> gradebook = new ArrayList(); //stores information on the gradebook
    public double totalwhole, totalscore;
    
    public sophmore(String name, String address, String number, int age, double tscore, double twhole)
    {
        super(name, address, number, age);
        studentname= name;
        studentaddress= address;
        studentnumber= number;
        studentage= age;
        totalscore=tscore;
        totalwhole=twhole;
    }
    public String getReqclass()
    {
        return "math 2, science 2, english 2, history 2";
        //required class for sophmore
    }
    public int grade()
    {
        return 10;
    }
    public String justname()
    {
        return studentname;
    }
    public String toString()
    {
        //edits phonenumer
        String phone1= studentnumber.substring(0, 3);
        String phone2= studentnumber.substring(3, 6);
        String phone3= studentnumber.substring(6);
        String completednumber= ("("+phone1+") "+phone2+"-"+phone3);
        
        
        return ("name: "+studentname+" address: "+studentaddress+" phonenumber: "+completednumber+"\nage: "+studentage+" current grade percentage is "+totalscore/totalwhole*100+"%");
    }
    public void gradebookdetails()
    {
        ListIterator iterator = gradebook.listIterator();
        System.out.println ("*****************************");
        while(iterator.hasNext())
        {
            System.out.println (iterator.next());
            
        }
        System.out.println ("*****************************");
    }
    public String gradebook()
    {
        Scanner scan= new Scanner (System.in);
        /*
        System.out.println ("please reenter student number");
        int identity= scan.nextInt();
        */
        
        
        
        System.out.println ("current grade percentage is "+totalscore/totalwhole*100+"%");
        
        boolean a= true;
        while (a)
        {
            System.out.println ("*****************************");
            for(int i = 0; i < gradebook.size(); i++)
            {
                System.out.println ("grade "+i+" "+gradebook.get(i)+"% "+lettergrade3(gradebook.get(i)));
            }
            System.out.println ("*****************************");
            System.out.println ("current grade is "+lettergrade(totalscore, totalwhole));
            
            System.out.println ("enter score");
            double score= scan.nextDouble();
            totalscore+= score;
            
            System.out.println ("enter total");
            double total= scan.nextDouble();
            totalwhole+= total;
            gradebook.add (score/total*100);
            System.out.println ("percentage: "+score/total*100+" lettergrade: "+lettergrade(score, total));
            System.out.println ("Current grade percentage is "+totalscore/totalwhole*100+" current letter grade is "+lettergrade(totalscore, totalwhole)); //+currentlettergrade);
            
            
            System.out.println ("want to continue 1=y or 2=n 3 for whole gradebook");
            String decider= scan.nextLine();
            //asks user if they want to continue on entering grades 1= yes 2= no
            
            
            boolean b=true;
            while (b)
            {
                int c= scan.nextInt();
                if (c==1)
                {
                    b= false;
                    
                }
                else if (c==2)
                {
                    a= false;
                    b= false;
                    
                }
                else if (c==3)
                {
                    System.out.println ("*****************************");
                    for(int i = 0; i < gradebook.size(); i++)
                    {
                        System.out.println ("grade "+i+" "+gradebook.get(i)+"% "+lettergrade3(gradebook.get(i)));
                    }
                    System.out.println ("*****************************");
                    System.out.println ("current grade is "+lettergrade(totalscore, totalwhole));
                }
                else
                {
                    System.out.println ("Error please enter just 1 to continue or 2 to stop");
                }
            }
        }
        System.out.println ("grade editing ended");
        
        return "current grade percentage is "+totalscore/totalwhole*100+"% ";
    }
    public void addgradebook(double score, double total)
    {
        gradebook.add(score/total*100);
        totalscore+= score;
        totalwhole+= total;
        
        
    }
    public void removefromgradebook(double total) //total here = total in addgradebook
    {
        gradebook.remove(gradebook.size()-1);
        totalwhole -= total;
        
    }
    public List getgradebook()
    {
        return gradebook;
    }
    public String lettergrade(double wholescore, double wholetotal) 
    {
        if (wholescore/wholetotal*100>=90)
        {
            return "A";
        }
        if ((wholescore/wholetotal*100<=90)&&(wholescore/wholetotal*100>=80))
        {
            return "B";
        }
        if ((wholescore/wholetotal*100<=80)&&(wholescore/wholetotal*100>=70))
        {
            return "C";
        }
        if ((wholescore/wholetotal*100<=70)&&(wholescore/wholetotal*100>=60))
        {
            return "D";
        }
        if (wholescore/wholetotal*100<=50)
        {
            return "F";
        }
        else 
        {
            return "Error enter valid grade percentage";
        }
    }
    public String lettergrade2 (double input) 
    {
        if (input*100>=90)
        {
            return "A";
        }
        if ((input*100<=90)&&(input*100>=80))
        {
            return "B";
        }
        if ((input*100<=80)&&(input*100>=70))
        {
            return "C";
        }
        if ((input*100<=70)&&(input*100>=60))
        {
            return "D";
        }
        if (input*100<=50)
        {
            return "F";
        }
        else
        {
            return "F Error enter valid grade percentage";
        }
    }
    public String lettergrade3 (double input) 
    {
        if (input>=90)
        {
            return "A";
        }
        if ((input<=90)&&(input>=80))
        {
            return "B";
        }
        if ((input<=80)&&(input>=70))
        {
            return "C";
        }
        if ((input<=70)&&(input>=60))
        {
            return "D";
        }
        if (input<=50)
        {
            return "F";
        }
        else
        {
            return "F Error enter valid grade percentage";
        }
    }
}