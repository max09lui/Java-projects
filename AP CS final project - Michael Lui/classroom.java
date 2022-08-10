public class classroom
{
    private int spotstaken, spotslimit;
    private String schoolinstructor;
    public classroom(int taken, int limit, String instructor)//holds informtion on classes
    {
        spotstaken=taken;
        spotslimit=limit;
        schoolinstructor=instructor;
    }
    public String toString()//returns from the object information on the class
    {
        return ("spots taken: "+spotstaken+" class limit "+spotslimit+" instructor: "+schoolinstructor);
    }
}