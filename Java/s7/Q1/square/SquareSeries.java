package square;
public class SquareSeries
{
    public SquareSeries(int n)
    {
        if(n>0)
        {
            System.out.println("Square of number Series:");
            for(int i=0; i<(n-1); i++)
            {
                System.out.println(""+(int)(Math.pow(i,2)));
            }
        }

        else
            System.out.println("You Entered the Wrong no.");

    }
}