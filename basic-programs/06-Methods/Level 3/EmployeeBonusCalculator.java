class EmployeeBonusCalculator {

    static int[][] generateData(){
        int[][] d=new int[10][2];

        for(int i=0;i<10;i++){
            d[i][0]=(int)(Math.random()*90000)+10000; 
            d[i][1]=(int)(Math.random()*10)+1;       
        }
        return d;
    }

    static double[][] calcBonus(int[][] d){

        double[][] r=new double[10][3];

        for(int i=0;i<10;i++){

            int sal=d[i][0];
            int yrs=d[i][1];

            double bonus;

            if(yrs>5)
                bonus=sal*0.05;
            else
                bonus=sal*0.02;

            r[i][0]=sal;
            r[i][1]=bonus;
            r[i][2]=sal+bonus;
        }
        return r;
    }

    public static void main(String[] args){

        int[][] data=generateData();
        double[][] res=calcBonus(data);

        System.out.println("OldSalary\tBonus\tNewSalary");

        for(int i=0;i<10;i++){
            System.out.println(res[i][0]+"\t"+res[i][1]+"\t"+res[i][2]);
        }
    }
}