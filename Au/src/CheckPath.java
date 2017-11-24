import java.util.List;

public class CheckPath
{
    public int goodPath(List<Integer> pathNode)
    {
        int good = 0;
        int i;
        int j;

        for(i=0;i<pathNode.size();i++)
        {
            for (j=0;j<pathNode.size();j++)
            {
                if(pathNode.get(i)==pathNode.get(j))
                {
                    good++;
                }
            }
        }

        if(good>pathNode.size())
        {
            //System.out.println("Bad path");
            good = 0;
        }
        else
        {
            //System.out.println("Good path");
            good = 1;
        }

        return good;
    }
}
