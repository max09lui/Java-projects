public class school
{
    private String schname, schaddress, schnumber;
    public school(String schoolname, String schooladdress, String schoolnumber)
    {
        schname= schoolname;
        schaddress= schooladdress;
        schnumber= schoolnumber;
        //holds information about school name, address, number
    }
    public String toString()
    {
        String result= ("the school name is "+schname+"\nthe school address is "+schaddress+"\nthe school phone number is "+schnumber);
        return result;
        //returns school name, address, number
    }

    
}