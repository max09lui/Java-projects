abstract public class students implements student
{
    private String fullname, homeaddress, phonenumber;
    private int studentage;
    private school myschool;
    public students(String name, String address, String number, int age)
    {
        fullname= name;
        homeaddress= address ;
        phonenumber= number;
        studentage= age;
        myschool= new school("Mr. Twiet's highschool", "123123 road road", "310-310-0000");
        
    }
    public String schoolinfo()
    {
        return myschool.toString();
    }
    public String getclass()
    {
        return getReqclass();
    }
    public String getGrades()
    {
        return "";
    }
    public String studentInfo()
    {
        return "";
    }
    abstract public String getReqclass();
    abstract public int grade();
}