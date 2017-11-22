import java.util.List;

public class CalculateSum
{
    private int sum = 0;

    private int currentNode = 0;

    private int nextNode = 0;

    private int size = 0;

    private int i = 0;

    public int findSum(List<Integer> path, int[][] multi)
    {
        size = path.size()-1;
        sum = 0;

        for(i=0;i<size;i++)
        {
            currentNode = i;
            nextNode = i+1;
            /*sum += multi[path[currentNode]-1][path[nextNode]-1];
            System.out.println("currentNode : "+path[currentNode]);
            System.out.println("nextNode : "+path[nextNode]);
            System.out.println("duration : "+multi[path[currentNode]-1][path[nextNode]-1]);*/

            sum += multi[path.get(currentNode)-1][path.get(nextNode)-1];
            /*System.out.println("currentNode : "+path.get(currentNode));
            System.out.println("nextNode : "+path.get(nextNode-1));
            System.out.println("duration : "+multi[path.get(currentNode)-1][path.get(nextNode)-1]);*/

        }
        //System.out.println("SUM : "+sum);

        return this.sum;
    }
}
