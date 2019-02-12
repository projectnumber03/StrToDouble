public class Double {

    public static double valueOf(String str) throws NumberFormatException {
        return str.charAt(0) == '-' ? convert(str, 1, -1) :  convert(str, 0, 1);
    }

    public static double convert(String str, int k1, int k2){

        double summ1 = 0;
        double summ2 = 0;
        String[] doubleSplit = str.split("[.,]");

        for (int i = k1; i < doubleSplit[0].length(); i++) {
            summ1 += charToInt(doubleSplit[0].charAt(i)) * Math.pow(10, doubleSplit[0].length() - i - 1);
        }
        if(doubleSplit.length == 2){
            for (int i = 0; i < doubleSplit[1].length(); i++) {
                summ2 += charToInt(doubleSplit[1].charAt(i)) / Math.pow(10, i + 1);
            }
        }
        return k2 * (summ1 + summ2);
    }

    public static int charToInt(char chr) throws NumberFormatException {
        if (chr >= '0' && chr <= '9') return chr - '0';
        throw new NumberFormatException();
    }
}
