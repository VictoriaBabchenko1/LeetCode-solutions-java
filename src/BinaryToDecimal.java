public class BinaryToDecimal {
    public String addBinary(String a, String b) {
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        int decimalResult = decimalA + decimalB;
        String binaryResult = Integer.toBinaryString(decimalResult);
        return  binaryResult;
    }
}
