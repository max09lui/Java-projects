public class classone extends classroom
{
    //one classes can only be taken by freshmen
    public int spotstaken, spotslimit;
    public String schoolinstructor;
    
    public classone(int taken, int limit, String instructor)
    {
        super (taken, limit, instructor);
        spotstaken=taken;
        spotslimit=limit;
        schoolinstructor=instructor;
        
    }
    public String avalibility()
    {
        int spotsavailable= spotslimit-spotstaken;
        return ("spots availble: "+spotsavailable);
        
        
    }
    
}