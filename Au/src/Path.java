import java.util.ArrayList;
import java.util.List;

public class Path
{
    private List<Integer> pathNode = new ArrayList<>();

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
        for(int a : this.pathNode)
        {
            System.out.print("-->"+a);
        }
        System.out.println();
    }

    public int getPathSize()
    {
        return this.pathNode.size();
    }

    public int getPath(int node)
    {
        return pathNode.get(node);
    }

    public List<Integer> getAllPath()
    {
        return this.pathNode;
    }

}
