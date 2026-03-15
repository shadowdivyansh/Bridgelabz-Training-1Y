class FactorsOperations {

    static int countFactors(int n){
        int c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                c++;
        return c;
    }

    static int[] getFactors(int n){

        int c=countFactors(n);
        int[] f=new int[c];
        int k=0;

        for(int i=1;i<=n;i++)
            if(n%i==0)
                f[k++]=i;

        return f;
    }

    static int sum(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++)
            s+=a[i];
        return s;
    }

    static int product(int[] a){
        int p=1;
        for(int i=0;i<a.length;i++)
            p*=a[i];
        return p;
    }

    public static void main(String[] args){

        int n=12;

        int[] f=getFactors(n);

        for(int i=0;i<f.length;i++)
            System.out.print(f[i]+" ");

        System.out.println("\nSum: "+sum(f));
        System.out.println("Product: "+product(f));
    }
}