import java.util.ArrayList;

public class Path
{
    private static int[] pathNode;

    private static int duration;

    public void setPathNode(int[] pathNode)
    {
        this.pathNode = pathNode;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getDuration()
    {
        return this.duration;
    }

    public void printPath()
    {
        for(int a : pathNode)
        {
            System.out.print(""+a+"-->");
        }
    }

}
