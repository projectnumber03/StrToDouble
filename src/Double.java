public class Double {
    public static double valueOf(String str) throws NumberFormatException {
        double summ1 = 0;
        double summ2 = 0;
        int k1;
        int k2;
        if (str.charAt(0) == '-') {
            k1 = 1;
            k2 = -1;
        }
        else{
            k1 = 0;
            k2 = 1;
        }
        String[] doubleSplit = str.split("[.,]");
        for (int i = k1; i < doubleSplit[0].length(); i++) {
            summ1 += charToInt(doubleSplit[0].charAt(i)) * Math.pow(10, doubleSplit[0].length() - i - 1);
        }
        try{
            for (int i = 0; i < doubleSplit[1].length(); i++) {
                summ2 += charToInt(doubleSplit[1].charAt(i)) / Math.pow(10, i + 1);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("В числе отсутствует дробная часть");
        }
        return k2 * (summ1 + summ2);
    }
    public static int charToInt(char chr) throws NumberFormatException {
        if (chr > '0' && chr < '9') {
            return (int) chr - '0';
        } else throw new NumberFormatException();
    }
}
