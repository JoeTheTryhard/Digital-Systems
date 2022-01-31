class DecimalToBinary
{
    public static int wholeConvert(int input)
    {
        int remainder;
        String output = "";
        while (input !=0)
        {
            remainder = input%2;
            output = remainder + output;
            input = input/2;
        }
        return Integer.parseInt(output);
    



    }
    public static double decimalConvert(double input)
    {
        String output = "";
        int i = 7;
        while(input !=0 && i >= 0)
        {
            input = input * 2;
            output = output + String.valueOf((int) input);
            i--;

        }
        return Double.parseDouble(output);
    }
    public static void main(String[] Args)
    {
        Double number = 100.5;
        Double decimalPart = number%1;
        int wholePart = (int) Math.floor(number);
        System.out.println(wholeConvert(wholePart) + decimalConvert(decimalPart));

    }
}