package a;
public class p
{
    void pos(int n)
    {
        if(n>0)
        {
            System.out.println("Positive");
        }
       else if(n<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
    }}

    public static void main(String[] args)
    {
        p obj = new p();
        obj.pos(5); // Test with a positive number
         
    }
}