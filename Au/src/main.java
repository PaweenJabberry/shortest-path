import java.util.Collections;

public class main
{
    public static void main(String args[])
    {
        Path path = new Path();

        Generation gen1 = new Generation();

        int[] sn1 = {0,50,65,45,30,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999}; //
        int[] sn2 = {50,0,60,999,999,62,27,999,999,999,999,999,999,999,999,999,999,999,999,999}; //
        int[] sn3 = {65,60,0,43,999,999,250,35,29,999,999,999,999,999,999,999,999,999,999,999}; //
        int[] sn4 = {45,999,43,0,90,999,999,999,17,40,15,999,999,999,999,999,999,999,999,999}; //
        int[] sn5 = {30,999,999,90,0,999,999,999,999,999,230,999,999,999,999,999,999,999,999,999}; // 7 8 9 10
        int[] sn6 = {999,62,999,999,999,0,25,999,999,999,999,136,999,999,999,999,999,999,999,999}; // 7 8 9 10
        int[] sn7 = {999,27,250,999,999,25,0,32,30,999,999,58,220,999,999,999,999,999,999,999}; // 11 12 13 14 15
        int[] sn8 = {999,999,35,999,999,999,32,0,120,999,999,61,88,20,999,999,999,999,999,999}; // 11 12 13 14 15
        int[] sn9 = {999,999,29,17999,999,30,120,0,61,999,999,999,150,50,999,999,999,999,999}; // 11 12 13 14 15
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

        int[][] multi = new int[][]{
                {0,50,65,45,30,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999}, //1
                {50,0,60,999,999,62,27,999,999,999,999,999,999,999,999,999,999,999,999,999}, //2
                {65,60,0,43,999,999,250,35,29,999,999,999,999,999,999,999,999,999,999,999},  //3
                {45,999,43,0,90,999,999,999,17,40,15,999,999,999,999,999,999,999,999,999}, // 4
                {30,999,999,90,0,999,999,999,999,999,230,999,999,999,999,999,999,999,999,999}, // 5
                {999,62,999,999,999,0,25,999,999,999,999,136,999,999,999,999,999,999,999,999}, // 6
                {999,27,250,999,999,25,0,32,30,999,999,58,220,999,999,999,999,999,999,999}, // 7
                {999,999,35,999,999,999,32,0,120,999,999,61,88,20,999,999,999,999,999,999}, // 8
                {999,999,29,17999,999,30,120,0,61,999,999,999,150,50,999,999,999,999,999}, // 9
                {999,999,999,40,999,999,999,999,61,0,32,999,999,999,194,147,999,999,110,999}, //10
                {999,999,999,15,230,999,999,999,999,32,0,999,999,999,999,130,999,999,999,999}, //11
                {999,999,999,999,999,136,58,61,999,999,999,0,144,999,999,999,161,999,999,999}, //12
                {999,999,999,999,999,999,999,88,999,999,999,144,0,24,999,999,71,54,999,999}, //13
                {999,999,999,999,999,999,999,20,150,999,999,999,24,0,40,999,999,72,999,22}, //14
                {999,999,999,999,999,999,999,999,60,194,999,999,999,40,0,77,999,999,14,220}, //15
                {999,999,999,999,999,999,999,999,999,147,999,999,999,999,77,0,999,999,89,999}, //16
                {999,999,999,999,999,999,999,999,999,999,999,161,71,999,999,999,0,26,999,999}, //17
                {999,999,999,999,999,999,999,999,999,999,999,999,54,72,999,999,26,0,999,16}, //18
                {999,999,999,999,999,999,999,999,999,110,999,999,999,999,14,89,999,999,0,72}, // 19
                {999,999,999,999,999,999,999,999,999,999,999,999,999,22,220,999,999,16,72,0} //20
        };

        int[] node1 = { 2, 3, 4, 5};
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
        int[] node20 = {14, 15, 18, 19};



        /*------------ Test sum duration-------------*/

        int[] test = {1,2,3,8,14,20};
        int currentNode;
        int nextNode;
        int size;
        int i;
        int sum = 0;

        size = test.length-1;

        for(i=0;i<size;i++)
        {
            currentNode = i;
            nextNode = i+1;
            sum += multi[test[currentNode]-1][test[nextNode]-1];
            System.out.println("currentNode : "+test[currentNode]);
            System.out.println("nextNode : "+test[nextNode]);
            System.out.println("duration : "+multi[test[currentNode]-1][test[nextNode]-1]);
        }
        System.out.println("SUM : "+sum);

        path.setPathNode(test);
        path.setDuration(sum);
        path.printPath();
        System.out.println("\nSUM of path : "+path.getDuration());

        gen1.addPaths(path);
    }
}
