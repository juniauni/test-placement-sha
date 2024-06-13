public class MenghitungChar {
    public static void menghitungChar(String str) {
        int upperCase = 0;
        int lowerCase = 0;
        int num = 0;
        int symbol = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                upperCase++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lowerCase++;
            } else if (Character.isDigit(str.charAt(i))) {
                num++;
            } else {
                symbol++;
            }
        }
        System.out.println("uppercase : " + upperCase);
        System.out.println("lowercase : " + lowerCase);
        System.out.println("angka : " + num);
        System.out.println("symbol : " + symbol);
    }
    public static void main(String[] args) {
        menghitungChar("pemrogramanDasarJava1");

    }
}