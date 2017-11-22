import java.util.List;

public class Path
{
    private List<Integer> pathNode;

    private int duration;

    public void setPathNode(List<Integer> pathNode)
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
            System.out.print("-->"+a);
        }
    }

}
