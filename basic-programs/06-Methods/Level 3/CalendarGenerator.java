import java.util.Scanner;

class CalendarGenerator {

    static boolean isLeap(int y){
        if((y%4==0 && y%100!=0) || y%400==0)
            return true;
        return false;
    }

    static int daysInMonth(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeap(y))
            return 29;
        return d[m-1];
    }

    static int firstDay(int m,int y){
        int d=1;
        int[] t={0,3,2,5,0,3,5,1,4,6,2,4};
        if(m<3) y--;
        return (y+y/4-y/100+y/400+t[m-1]+d)%7;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month: ");
        int m=sc.nextInt();
        System.out.print("Enter year: ");
        int y=sc.nextInt();

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int fd=firstDay(m,y);
        int days=daysInMonth(m,y);

        for(int i=0;i<fd;i++)
            System.out.print("    ");

        for(int d=1;d<=days;d++){
            System.out.printf("%3d ",d);
            if((fd+d)%7==0)
                System.out.println();
        }
    }
}