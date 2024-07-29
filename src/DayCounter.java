class DayCounter {
    public static void main(String[] arguments) {
        int yearIn = 2012;
        int monthIn = 1;
        if (arguments.length > 0)
            yearIn = Integer.parseInt(arguments[0]);

       // System.out.println(yearIn + "/" + yearIn + " has " + countDays(monthIn, yearIn) + " days.");
        System.out.println(yearIn +" has following dates:");
        for (int i=1; i < 13; i++){
            for(int j = 1; j<= countDays(i,yearIn); j++)
                System.out.println(i + "/" + j + "/" + yearIn);
        }

    }
    static int countDays(int month, int year){
        int count = -1;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0)
                    count = 29;
                else
                    count = 28;
                if ((year % 100 == 0) & (year % 400 != 0))
                    count = 28;
        }
        return count;
    }
}