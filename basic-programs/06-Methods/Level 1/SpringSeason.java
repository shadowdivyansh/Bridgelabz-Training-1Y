package com.gla.methods;

class SpringSeason {
    public boolean check(int m, int d) {
        if (m == 3 && d >= 20) return true;
        if (m > 3 && m < 6) return true;
        if (m == 6 && d <= 20) return true;
        return false;
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        SpringSeason obj = new SpringSeason();
        if (obj.check(m, d))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
