import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class main
{
    public static void main(String args[])
    {
        Path path;

        Generation gen1 = new Generation();

        ArrayList<Generation> allGen = new ArrayList<>();

        CalculateSum cal = new CalculateSum();

        Random rand = new Random();

        RandomWithExclusion randomWithExclusion = new RandomWithExclusion();

        Crossover crossover = new Crossover();

        /*int[] sn1 = {0,50,65,45,30,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999}; //
        int[] sn2 = {50,0,60,999,999,62,27,999,999,999,999,999,999,999,999,999,999,999,999,999}; //
        int[] sn3 = {65,60,0,43,999,999,250,35,29,999,999,999,999,999,999,999,999,999,999,999}; //
        int[] sn4 = {45,999,43,0,90,999,999,999,17,40,15,999,999,999,999,999,999,999,999,999}; //
        int[] sn5 = {30,999,999,90,0,999,999,999,999,999,230,999,999,999,999,999,999,999,999,999}; // 7 8 9 10
        int[] sn6 = {999,62,999,999,999,0,25,999,999,999,999,136,999,999,999,999,999,999,999,999}; // 7 8 9 10
        int[] sn7 = {999,27,250,999,999,25,0,32,30,999,999,58,220,999,999,999,999,999,999,999}; // 11 12 13 14 15
        int[] sn8 = {999,999,35,999,999,999,32,0,120,999,999,61,88,20,999,999,999,999,999,999}; // 11 12 13 14 15
        int[] sn9 = {999,999,29,17,999,999,30,120,0,61,999,999,999,150,50,999,999,999,999,999}; // 11 12 13 14 15
        int[] sn10 = {999,999,999,40,999,999,999,999,61,0,32,999,999,999,194,147,999,999,110,999}; // 11 12 13 14 15
        int[] sn11 = {999,999,999,15,230,999,999,999,999,32,0,999,999,999,999,130,999,999,999,999}; // 16 17 18 19 20 21
        int[] sn12 = {999,999,999,999,999,136,58,61,999,999,999,0,144,999,999,999,161,999,999,999}; // 16 17 18 19 20 21
        int[] sn13 = {999,999,999,999,999,999,999,88,999,999,999,144,0,24,999,999,71,54,999,999}; // 16 17 18 19 20 21
        int[] sn14 = {999,999,999,999,999,999,999,20,150,999,999,999,24,0,40,999,999,72,999,22}; // 16 17 18 19 20 21
        int[] sn15 = {999,999,999,999,999,999,999,999,60,194,999,999,999,40,0,77,999,999,14,220}; // 16 17 18 19 20 21
        int[] sn16 = {999,999,999,999,999,999,999,999,999,147,999,999,999,999,77,0,999,999,89,999}; // 22 23 24 25 26 27 28
        int[] sn17 = {999,999,999,999,999,999,999,999,999,999,999,161,71,999,999,999,0,26,999,999}; // 22 23 24 25 26 27 28
        int[] sn18 = {999,999,999,999,999,999,999,999,999,999,999,999,54,72,999,999,26,0,999,16}; // 22 23 24 25 26 27 28
        int[] sn19 = {999,999,999,999,999,999,999,999,999,110,999,999,999,999,14,89,999,999,0,72}; // 22 23 24 25 26 27 28
        int[] sn20 = {999,999,999,999,999,999,999,999,999,999,999,999,999,22,220,999,999,16,72,0}; // 22 23 24 25 26 27 28
        */

        int[][] multi = new int[][]{
                {0,50,65,45,30,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999}, //1
                {50,0,60,999,999,62,27,999,999,999,999,999,999,999,999,999,999,999,999,999}, //2
                {65,60,0,43,999,999,250,35,29,999,999,999,999,999,999,999,999,999,999,999},  //3
                {45,999,43,0,90,999,999,999,17,40,15,999,999,999,999,999,999,999,999,999}, // 4
                {30,999,999,90,0,999,999,999,999,999,230,999,999,999,999,999,999,999,999,999}, // 5
                {999,62,999,999,999,0,25,999,999,999,999,136,999,999,999,999,999,999,999,999}, // 6
                {999,27,250,999,999,25,0,32,30,999,999,58,220,999,999,999,999,999,999,999}, // 7
                {999,999,35,999,999,999,32,0,120,999,999,61,88,20,999,999,999,999,999,999}, // 8
                {999,999,29,17,999,999,30,120,0,61,999,999,999,150,50,999,999,999,999,999}, // 9
                {999,999,999,40,999,999,999,999,61,0,32,999,999,999,194,147,999,999,110,999}, //10
                {999,999,999,15,230,999,999,999,999,32,0,999,999,999,999,130,999,999,999,999}, //11
                {999,999,999,999,999,136,58,61,999,999,999,0,144,999,999,999,161,999,999,999}, //12
                {999,999,999,999,999,999,999,88,999,999,999,144,0,24,999,999,71,54,999,999}, //13
                {999,999,999,999,999,999,999,20,150,999,999,999,24,0,40,999,999,72,999,22}, //14
                {999,999,999,999,999,999,999,999,60,194,999,999,999,40,0,77,999,999,14,220}, //15
                {999,999,999,999,999,999,999,999,999,147,130,999,999,999,77,0,999,999,89,999}, //16
                {999,999,999,999,999,999,999,999,999,999,999,161,71,999,999,999,0,26,999,999}, //17
                {999,999,999,999,999,999,999,999,999,999,999,999,54,72,999,999,26,0,999,16}, //18
                {999,999,999,999,999,999,999,999,999,110,999,999,999,999,14,89,999,999,0,72}, // 19
                {999,999,999,999,999,999,999,999,999,999,999,999,999,22,220,999,999,16,72,0} //20
        };

        /*int[] node1 = { 2, 3, 4, 5};
        int[] node2 = { 1, 3, 6, 7};
        int[] node3 = { 1, 2, 4, 7, 8, 9};
        int[] node4 = {1, 3, 5, 9, 10, 11};
        int[] node5 = {1, 4, 11};
        int[] node6 = {2, 7, 12};
        int[] node7 = {2, 3, 6, 8, 9, 12, 13};
        int[] node8 = {3, 7, 9, 12, 13, 14};
        int[] node9 = {3, 4, 7, 8, 10, 14, 15};
        int[] node10 = {4, 9, 11, 15, 16, 19};
        int[] node11 = {4, 5, 10, 16};
        int[] node12 = {6, 7, 8, 13, 17};
        int[] node13 = {8, 12, 14, 17, 18};
        int[] node14 = {8, 9, 13, 15, 18, 20};
        int[] node15 = {9, 10, 14, 16, 19, 20};
        int[] node16 = {10, 15, 19};
        int[] node17 = {12, 13, 18};
        int[] node18 = {13, 14, 17, 20};
        int[] node19 = {10, 15, 16, 20};
        int[] node20 = {14, 15, 18, 19};*/

        int[][] multi2 = new int[][]{
                { 2, 3, 4, 5}, //1
                { 1, 3, 6, 7}, //2
                { 1, 2, 4, 7, 8, 9}, //3
                {1, 3, 5, 9, 10, 11}, //4
                {1, 4, 11}, //5
                {2, 7, 12}, //6
                {2, 3, 6, 8, 9, 12, 13}, //7
                {3, 7, 9, 12, 13, 14}, //8
                {3, 4, 7, 8, 10, 14, 15}, //9
                {4, 9, 11, 15, 16, 19}, //10
                {4, 5, 10, 16}, //11
                {6, 7, 8, 13, 17}, //12
                {8, 12, 14, 17, 18}, //13
                {8, 9, 13, 15, 18, 20}, //14
                {9, 10, 14, 16, 19, 20}, //15
                {10, 11, 15, 19}, //16
                {12, 13, 18}, //17
                {13, 14, 17, 20}, //18
                {10, 15, 16, 20}, //19
                {14, 15, 18, 19} //20
        };


        /*------------ Create First Generation--------------*/


        int size;

        int currentNum;

        int nextNum;

        int sum;

        int check = 0;

        int insideCheck;

        int need;

        int goodPath = 0;

        int  n;

        int i=0;

        int startPoint;

        int endPoint;

        int veryGood = 0;

        int tempBest = 0;

        List<Integer> num;

        List<Integer> checkNum = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        do
        {
            goodPath=1;
            System.out.printf("Enter start point ? : ");
            startPoint = in.nextInt();
            System.out.printf("Enter end point ? : ");
            endPoint = in.nextInt();
            if(startPoint==endPoint)
            {
                System.out.println("start point and end point not should be the same.");
                goodPath=0;
            }
        } while (goodPath!=1);

        System.out.printf("How many generation? : ");
        need = in.nextInt();

        long start = System.currentTimeMillis();

        do
        {
            num = new ArrayList<>();
            num.add(startPoint);
            currentNum = startPoint-1;
            goodPath=1;
            do
            {
                //System.out.println("Current Array number : "+currentNum);
                size = multi2[currentNum].length - 1;
                //System.out.println("Size : "+size);
                if(size>0)
                {
                    n = randomWithExclusion.getRandomWithExclusion(rand,0,size,checkNum);
                }
                else
                {
                    n = 0;
                }
                //System.out.println("Number of random : "+n);
                nextNum = multi2[currentNum][n];
                //System.out.println("Next number : "+nextNum);
                for(int a :num)
                {
                    if(a==nextNum)
                    {
                        //System.out.println("-----------------Same number------------------");
                        check=1;
                        insideCheck = 0;
                        if(checkNum.size()==0)
                        {
                            checkNum.add(n);
                        }
                        for(int c :checkNum)
                        {
                            if(c==n)
                            {
                                insideCheck = 1;
                            }
                        }
                        if(insideCheck==0)
                        {
                            checkNum.add(n);
                        }
                        //System.out.println("Real CheckNum : "+(checkNum.size()));
                    }
                }
                Collections.sort(checkNum);
                //System.out.println("EX : ");
                /*for(int d : checkNum)
                {
                    System.out.print(""+d+" ");
                }*/
                //System.out.println("\n");
                if(size==checkNum.size()-1)
                {
                    goodPath=0;
                    //System.out.println("-------------------Badpath!! size : "+(checkNum.size()-1));
                }
                if(check==0)
                {
                    num.add(nextNum);
                    currentNum = nextNum-1;
                    checkNum = new ArrayList<>();
                }
                check=0;
                if(goodPath==0)
                {
                    //System.out.println("---------------------de ja");
                    checkNum = new ArrayList<>();
                    break;
                }
                /*for(int a : num)
                {
                    System.out.print("-->"+a);
                }*/
                //System.out.println("\n\n");
            } while (nextNum!=endPoint);

            if(goodPath==1)
            {
                path = new Path();
                sum = cal.findSum(num,multi);
                path.setPathNode(num);
                path.setDuration(sum);

                //System.out.println("-----------New-------------");
                //path.printPath();
                //System.out.println("SUM : "+path.getDuration());
                gen1.addPaths(path);
                i++;
            }

        } while (i!=100);

        //gen1.printAllPaths();
        gen1.sortPaths();
        //System.out.println("\n---------------After Sorting--------------");
        //gen1.printAllPaths();
        //gen1.printBestPaths();

        //System.out.println("Bad Count : "+badCount);


        Generation newGen;

        Generation tempGen;

        /*newGen=crossover.Crossover(gen1,multi);

        System.out.println("\n\nNew Gen");
        newGen.sortPaths();
        newGen.printAllPaths();*/

        tempGen = gen1;
        i=0;

        tempBest = gen1.getBestPaths();
        goodPath=0;
        do
        {
            newGen=crossover.Crossover(tempGen,multi);
            newGen.sortPaths();
            allGen.add(newGen);
            tempGen = newGen;
            i++;
            if(tempGen.getBestPaths()==tempBest)
            {
                goodPath++;
            }
            else
            {
                goodPath=0;
                tempBest=tempGen.getBestPaths();
            }
            if(goodPath==3)
            {
                break;
            }
        } while (i!=need);

        for(i=0;i<allGen.size();i++)
        {
            System.out.println("-----------------"+"Gen "+(i+1)+"-----------------");
            tempGen=allGen.get(i);
            //tempGen.printAllPaths();
            tempGen.printBestPaths();
            System.out.println();
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
}
