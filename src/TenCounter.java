class TenCounter{
    public static void main(String[] arguments) {
        String counter = "ONE";
        //int count = 0;
        if (arguments.length > 0)
            counter = arguments[0].toLowerCase();
        else
            counter = counter.toLowerCase();

        if(countClass(counter)>0)
            System.out.println("The number is: "+ countClass(counter));
        else
            System.out.println("The number is not in the 1-10 range");



    }


    static long countClass(String count) {
        //String tenCount = count;
        //System.out.println(count);
        long counter;
        switch (count) {
            case "one":
                counter = 1;
                break;
            case "two":
                counter = 2;
                break;
            case "three":
                counter = 3;
                break;
            case "four":
                counter = 4;
                break;
            case "five":
                counter = 5;
                break;
            case "six":
                counter = 6;
                break;
            case "seven":
                counter = 7;
                break;
            case "eight":
                counter = 8;
                break;
            case "nine":
                counter = 9;
                break;
            case "ten":
                counter = 10;
                break;
            default:
                counter = 0;

        }
        return counter;
    }

}
