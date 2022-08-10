import java.util.*;
public class fresh_gui
{
    public static void main (String[] args)
    {
        Scanner scan= new Scanner (System.in);
        freshmen[] classonegradebook= new freshmen[30];
        freshmen[] gradebookdetails= new freshmen[30];
        String assigmentlist="";
        Double assigmenttotal=0.0; //wrapper class
        
        classonegradebook[0]= new freshmen ("Frances Padilla", "4 Goldfield Rd. Honolulu, HI 96815", "6304468851", 14, 0, 0);
        classonegradebook[1]= new freshmen ("Wanda Webster", "44 Shirley Ave. West Chicago, IL 60185", "2269062721", 15, 0, 0);
        classonegradebook[2]= new freshmen ("Katie Phelps", "514 S. Magnolia St. Orlando, FL 32806", "6719251352", 14, 0, 0);
        classonegradebook[3]= new freshmen ("Tyler Shu", "514 S. Magnolia St. Orlando, FL 32806", "1255464478", 14, 0, 0);
        classonegradebook[4]= new freshmen ("Joshua Perkins", "44 Shirley Ave. West Chicago, IL 60185", "9495694371", 15, 0, 0);
        classonegradebook[5]= new freshmen ("Debra Soto", "514 S. Magnolia St. Orlando, FL 32806", "8356922371", 14, 0, 0);
        
        classonegradebook[0].addgradebook(87, 100);
        classonegradebook[1].addgradebook(99, 100);
        classonegradebook[2].addgradebook(89, 100);
        classonegradebook[3].addgradebook(62, 100);
        classonegradebook[4].addgradebook(77, 100);
        classonegradebook[5].addgradebook(57, 100);
        //System.out.println (classonegradebook[0].gradebook());
        
        int studentcount=5;//refers to the array
        
        int studentamountfreshemn=studentcount+1;
        int freshmenclasslimit=30;

        System.out.print ("1 to add to class\n2 to remove to class\n3 to see class info\n4 change class limit\n5 to see all students\n6 to add individual grades\n7 for information about the school\n8 to edit students");
        System.out.println ("\n9 input assigment grades \n10 to add to assigment list \n11 to see student grade \n12 to see classroom average\n13 to end");
        boolean go= true;
        while (go)// add class, remove from class, display results, change class limit, put limit on amount of students added and limit on ammount students taken out.
        {
           System.out.println ("enter a number that will make a command");
           int input= scan.nextInt();
           if (studentamountfreshemn>= freshmenclasslimit)// checks if the limit of class 
           {
               System.out.println ("All spots have been taken please take some students outside of the classroom");
               
           }
           if (input==1)// add student to class
           {
                if (studentamountfreshemn>freshmenclasslimit)
                {
                    System.out.println ("There are a maximum number of students please remove a studebt to add another student");
                    
                }
                studentamountfreshemn++;
                studentcount++;
                
                System.out.println ("Enter name");
                scan.nextLine();
                String name= scan.nextLine();
                
                System.out.println ("Enter address");
                String address= scan.nextLine();
                
                System.out.println ("Enter phone number");
                String number= scan.nextLine();
                
                System.out.println ("Enter age");
                int age= scan.nextInt();
                
                System.out.println ("Enter current total ");
                double totalscore= scan.nextDouble();
                
                System.out.println ("Enter current total whole");
                double totalwhole= scan.nextDouble();
                
                classonegradebook[studentcount]= new freshmen (name, address, number, age, totalscore, totalwhole);
                System.out.println ("you have entered "+classonegradebook[studentcount]);
                System.out.println ("student added");
                
           }
           if (input==2) // remove student from class
           {
               System.out.println ("Which student do you want to remove (enter their number)");
               int removed= scan.nextInt();
               System.out.println (classonegradebook[removed].justname());
               //classonegradebook[removed]= new freshmen ("Student has been Removed from class", "", "",0/0 ,0/0, 0/0);
               classonegradebook[removed]= null;
               studentamountfreshemn--;
               System.out.println ("student removed");
               System.out.println ("to create a new student just edit the deleted student");
            }
           if (input==3) //project
           {
               classone Science_1 = new classone (studentamountfreshemn, freshmenclasslimit, "Judy Adam-Smith");
               classone Math_1 = new classone (studentamountfreshemn, freshmenclasslimit, "Hassian Twiet");
               classone English_1 = new classone (studentamountfreshemn, freshmenclasslimit, "Kashimira Vijiyan");
               classone History_1 = new classone (studentamountfreshemn, freshmenclasslimit, "Linda Kurt");
               System.out.println (Science_1+" "+Science_1.avalibility());
               System.out.println (Math_1+" "+Math_1.avalibility());
               System.out.println (English_1+" "+English_1.avalibility());
               System.out.println (History_1+" "+History_1.avalibility());
               
               
           }
           if (input==4)// change limit of class
           {
               System.out.println ("Your current class limit is "+freshmenclasslimit+"what do you want to change limit to be");
               freshmenclasslimit= scan.nextInt();
               if (freshmenclasslimit<=0)
               {
                   System.out.println ("Error please try again classes are unable to be less than zero");
               }
               System.out.println ("you have changed it to "+freshmenclasslimit);
               
           
           }
           if (input==5)
           {               
               for (int i=0; i<=29; i++)
               {
                   System.out.println ("student "+i+" "+(classonegradebook[i]));
                   System.out.println ("");
               }
               
           }
           if (input==6)// edit grade
           {
               System.out.println ("change grade");
               System.out.println ("Which student grade do you want to change (enter their number)");
               int identity= scan.nextInt();
               System.out.println (classonegradebook[identity].justname());
               System.out.println (classonegradebook[identity].gradebook());
               
           }
           if (input==7)
           {
               school school= new school("Michael's school", "742 Evergreen Terrace", "(251) 546-9442");
               System.out.println (school);
               
           }
           if (input==8)// edits student information
           {
               System.out.println ("enter student number to edit");
               
               int studentchanged= scan.nextInt();
               System.out.println ("current information on student is "+classonegradebook[studentchanged]);
               
               System.out.println ("enter new name");
               scan.nextLine();
               String newname= scan.nextLine();
               
               System.out.println ("enter new address");
               String newaddress= scan.nextLine();
               
               System.out.println ("enter new phone number");
               String newnumber= scan.nextLine();
               
               System.out.println ("enter new age");
               int newage= scan.nextInt();
               
               System.out.println ("enter new total");
               Double newtotal= scan.nextDouble();
               
               System.out.println ("enter new whole");
               Double newwhole= scan.nextDouble();
               
               classonegradebook[studentchanged]= new freshmen (newname, newaddress, newnumber, newage, newtotal, newwhole);
               System.out.println ("the student has been changed to "+classonegradebook[studentchanged]);
           }
           if (input==9)
           {
               System.out.println ("which student do you want to change (refer to student list)");
               int identity= scan.nextInt();
               System.out.println ("the assigment was out of "+assigmenttotal);
               System.out.println ("what did the student score");
               int studentscore= scan.nextInt();
               classonegradebook[identity].removefromgradebook(assigmenttotal);
               classonegradebook[identity].addgradebook(studentscore, assigmenttotal);
           }
           if (input==10)//adds to assigments
           {
               System.out.println ("100=test, 20=quiz, 5=homework");
               assigmenttotal= scan.nextDouble();//the wrapper class
               for(int i=0; i<=studentcount;i++)
               {
                   classonegradebook[i].addgradebook(0, assigmenttotal);
               }
               
           }
           if (input==11)//displays grade
           {
               int identity= scan.nextInt();
               classonegradebook[identity].gradebookdetails();
               
               
           }
           if (input==12)
           {
               double classscore=0;
               for (int i=0; i<=studentcount; i++)
               {
                   classscore+=classonegradebook[i].totalscore;
                   
               }
               System.out.println ("The average amount of points scored by the students in the class is "+classscore/(studentcount+1));
               
               double classwhole=0;
               for (int i=0; i<=studentcount; i++)
               {
                   classwhole+=classonegradebook[i].totalwhole;
                   
               }
               System.out.println ("The average amount of points totals to "+classwhole/(studentcount+1));
               
               System.out.println ("average percentage is "+(classscore/classwhole)*100+" the average letter grade is a "+lettergrade(classscore, classwhole));
               
           }
           if (input==13)
           {
               go=false;
               
           }
        }  
        
        
    }
    public static String lettergrade(double wholescore, double wholetotal) 
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
    
}