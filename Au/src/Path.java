public class Path
{
    private int[] pathNode;

    private int duration;

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

    /**
     *  Override compareTo to order Tile by name and sequence
     */ /*
    @Override
    public  int compareTo(Path o)
    {
        if(this.getDuration().equalsIgnoreCase(o.getDuration()))
        {
            return Integer.compare(this.getTileSequence(), o.getTileSequence());
        }
        else
        {
            return this.getLetter().compareTo(o.getLetter());
        }
    }*/

}
