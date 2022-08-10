public class classtwo extends classroom
{
    //one classes can only be taken by sophmores
    public int spotstaken, spotslimit;
    public String schoolinstructor;
    
    public classtwo(int taken, int limit, String instructor)
    {
        super (taken, limit, instructor);
        spotstaken=taken;
        spotslimit=limit;
        schoolinstructor=instructor;
        
    }
    public String avalibility()
    {
        int spotsavailable= spotslimit-spotstaken;
        return ("spots availble:"+spotsavailable);
        
        
    }
    
}