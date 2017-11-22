import java.util.ArrayList;

public class Sorting
{
    public ArrayList<Path> sortPath(ArrayList<Path> nonPaths)
    {
        ArrayList<Path> newPath = new ArrayList<>();
        Path temp;

        //int[] a = { 5, 4, 3, 1, 1 };
        int i =0;
        int j =0;

        System.out.println("Before");
        for (Path b: nonPaths)
        {
            System.out.println(""+i+1+""+b.getDuration());
            i++;
        }

        //int[] sortedArray = new int[a.length];
        //int temp;
        for (j = 0; j < nonPaths.size() - 1; j++)
        {// added this for loop, think about logic why do we have to add this to make it work

            for (i = 0; i < nonPaths.size() - 1; i++)
            {
                if (nonPaths.get(i).getDuration() > nonPaths.get(i+1).getDuration())
                {
                    temp = nonPaths.get(i);
                    //nonPaths.get(i) = nonPaths.get(i+1);
                    //nonPaths.get(i+1) = temp;
                    newPath = nonPaths;
                }
            }
        }

        System.out.println("After");
        //for (int b: sortedArray)
        {
            //System.out.println(""+b);
        }



        return newPath;
    }
}
