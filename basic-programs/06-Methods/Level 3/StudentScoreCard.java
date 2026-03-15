import java.util.Scanner;

class StudentScoreCard {

    static int[][] generateMarks(int n){

        int[][] m=new int[n][3];

        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                m[i][j]=(int)(Math.random()*100);

        return m;
    }

    static double[][] calculate(int[][] m){

        int n=m.length;
        double[][] r=new double[n][3];

        for(int i=0;i<n;i++){

            int total=m[i][0]+m[i][1]+m[i][2];
            double avg=total/3.0;
            double per=(total/300.0)*100;

            r[i][0]=total;
            r[i][1]=Math.round(avg*100)/100.0;
            r[i][2]=Math.round(per*100)/100.0;
        }
        return r;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[][] marks=generateMarks(n);
        double[][] res=calculate(marks);

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%");

        for(int i=0;i<n;i++){

            System.out.print(marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t");

            System.out.println(res[i][0]+"\t"+res[i][1]+"\t"+res[i][2]);
        }
    }
}