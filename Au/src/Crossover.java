import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Crossover
{
    private CheckPath checkPath = new CheckPath();

    private RandomWithExclusion randomWithExclusion = new RandomWithExclusion();

    private Random rand = new Random();

    private CalculateSum calculateSum = new CalculateSum();

    public Generation Crossover(Generation oldGen, int[][] multi)
    {

        Generation NewGen = new Generation();

        int n;
        int i;
        int j;
        int w;
        int stop = 0;
        int need = 20;

        for(i=0;i<20;i++)
        {
            NewGen.addPaths(oldGen.paths.get(i));
        }

        do
        {
            Path tempPath1;

            Path tempPath2;

            Path tempPath3 = new Path();

            Path tempPath4 = new Path();

            List<Integer> num = new ArrayList<>();

            List<Integer> samePoint = new ArrayList<>();

            List<Integer> checkNum = new ArrayList<>();

            n = randomWithExclusion.getRandomWithExclusion(rand,0,oldGen.paths.size()-1,checkNum);

            tempPath1 = oldGen.paths.get(n);
            //tempPath1.printPath();

            n = randomWithExclusion.getRandomWithExclusion(rand,0,oldGen.paths.size()-1,checkNum);

            tempPath2 = oldGen.paths.get(n);
            //tempPath2.printPath();

            for(i=1;i<tempPath1.getPathSize()-1;i++)
            {
                for(j=1;j<tempPath2.getPathSize()-1;j++)
                {
                    if(tempPath1.getPath(i)==tempPath2.getPath(j))
                    {
                        samePoint.add(tempPath1.getPath(i));
                    }
                }
            }

            //System.out.println("SIZE : "+samePoint.size());
            /*for(int p : samePoint)
            {
                System.out.println(""+p);
            }*/

            if(samePoint.size()>0)
            {
                n = randomWithExclusion.getRandomWithExclusion(rand,0,samePoint.size()-1,checkNum);


                //System.out.println("Position : "+n+" Random : "+samePoint.get(n));

                //System.out.println("Temp1 Size : "+tempPath1.getPathSize());

                for(i=0;i<tempPath1.getPathSize();i++)
                {
                    w=tempPath1.getPath(i);
                    //System.out.println(""+w);
                    num.add(w);
                    if (tempPath1.getPath(i)==samePoint.get(n))
                    {
                        break;
                    }
                }


                for(i=0;i<tempPath2.getPathSize();i++)
                {
                    if(tempPath2.getPath(i)==samePoint.get(n))
                    {
                        stop=i;
                        break;
                    }
                }

                //System.out.println("STOP : "+stop);

                for(i=stop+1;i<tempPath2.getPathSize();i++)
                {
                    w=tempPath2.getPath(i);
                    num.add(w);
                }

                i=checkPath.goodPath(num);
                if (i==1)
                {
                    tempPath3.setPathNode(num);
                    tempPath3.setDuration(calculateSum.findSum(num,multi));
                    NewGen.addPaths(tempPath3);
                    need+=1;
                    if(need==100)
                    {
                        break ;
                    }
                }

                num = new ArrayList<>();


                for(i=0;i<tempPath2.getPathSize();i++)
                {
                    w=tempPath2.getPath(i);
                    //System.out.println(""+w);
                    num.add(w);
                    if (tempPath2.getPath(i)==samePoint.get(n))
                    {
                        break;
                    }
                }


                for(i=0;i<tempPath1.getPathSize();i++)
                {
                    if(tempPath1.getPath(i)==samePoint.get(n))
                    {
                        stop=i;
                        break;
                    }
                }

                //System.out.println("STOP : "+stop);

                for(i=stop+1;i<tempPath1.getPathSize();i++)
                {
                    w=tempPath1.getPath(i);
                    num.add(w);
                }

                i=checkPath.goodPath(num);
                if (i==1)
                {
                    tempPath4.setPathNode(num);
                    tempPath4.setDuration(calculateSum.findSum(num,multi));
                    NewGen.addPaths(tempPath4);
                    need+=1;
                    if(need==100)
                    {
                        break ;
                    }
                }

            }

            //System.out.println("NEED : "+need);
        } while (true);

        return NewGen;
    }
}
