import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Generation
{
    protected ArrayList<Path> paths = new ArrayList<Path>();


    public void addPaths(Path path)
    {
        this.paths.add(path);
    }

    public void sortPaths()
    {
        Collections.sort(this.paths, new Comparator<Path>(){
            public int compare(Path p1, Path p2) {
                return p1.getDuration() - p2.getDuration();
            }
        });
    }


    public void printAllPaths()
    {
        int i = 1;
        for(Path a: paths)
        {
            System.out.println("\nPath : "+i);
            a.printPath();
            System.out.println("\nSUM : "+a.getDuration());
            i++;
        }
    }


}
