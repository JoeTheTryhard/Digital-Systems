class DecimalToBinary
{
    public static Double FullConvert(double input)
    {
        Double decimalPart = input%1;
        int wholePart = (int) Math.floor(input);
        return Double.parseDouble(wholeConvert(wholePart) + decimalConvert(decimalPart));
         
    }
    public static String wholeConvert(int input)
    {
        int remainder;
        String output = "";
        while (input !=0)
        {
            remainder = input%2;
            output = remainder + output;
            input = input/2;
        }
        return output;
    



    }
    public static String decimalConvert(double input)
    {
        String output = ".";
        int i = 7;
        while(input !=0 && i >= 0)
        {
            input = input * 2;
            if (input >= 1)
                {
                input -= 1;
                output += "1";
                }
            else
            output += "0";
            i--;

        }
        return output;
    }
    public static void main(String[] Args)
    {
        System.out.println(FullConvert(10.4959));
    }
}