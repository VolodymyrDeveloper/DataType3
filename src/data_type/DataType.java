package data_type;

public class DataType {
    public static void main(String[] args) {

        byte A = 10;
        byte B = 5;
        byte resultByteOperations;
        System.out.println("BYTE OPERATIONS");
        System.out.println("Variable A equal " + A + " ; " + "Variable B equal " + B);
        resultByteOperations = (byte) (A + B);
        System.out.println("Result of adding variables " + resultByteOperations);
        resultByteOperations = (byte) (A - B);
        System.out.println("Result of subtraction variables " + resultByteOperations);
        resultByteOperations = (byte) (A * B);
        System.out.println("Result of multiplication variables " + resultByteOperations);
        resultByteOperations = (byte) (A / B);
        System.out.println("Result of division variables " + resultByteOperations);


        short C = 500;
        short D = 10;
        short resultShortOperations;
        System.out.println("SHORT OPERATIONS");
        System.out.println("Variable C equal " + C + ";  " + "Variable D equal " + D);
        resultShortOperations = (short) (C + D);
        System.out.println("Result of adding variables " + resultShortOperations);
        resultShortOperations = (short) (C - D);
        System.out.println("Result of substraction variables " + resultShortOperations);
        resultShortOperations = (short) (C * D);
        System.out.println("Result of mutliplication " + resultShortOperations);
        resultShortOperations = (short) (C / D);
        System.out.println("Result of division " + resultShortOperations);


        int E = 5555;
        int F = 333;
        int resultIntOperations;
        System.out.println("INT OPERATIONS");
        System.out.println("Variable E equal " + E + " ; " + "Variable F equal " + F);
        resultIntOperations = E + F;
        System.out.println("Result of adding variables " + resultIntOperations);
        resultIntOperations = E - F;
        System.out.println("Result of substraction variables " + resultIntOperations);
        resultIntOperations = E * F;
        System.out.println("Result of multiplication variables " + resultIntOperations);
        resultIntOperations = E / F;
        System.out.println("Result of division variables " + resultIntOperations);


        long J = 9999999L;
        long M = 7777L;
        long resultLongOperations;
        System.out.println("LONG OPERATIONS");
        System.out.println("Variable J equal " + J + " ; " + "Variable M equal " + M);
        resultLongOperations = J + M;
        System.out.println("Result of adding variables " + resultLongOperations);
        resultLongOperations = J - M;
        System.out.println("Result of substraction variables " + resultLongOperations);
        resultLongOperations = J * M;
        System.out.println("Result of multiplication variables " + resultLongOperations);
        resultLongOperations = J / M;
        System.out.println("Result of division variables " + resultLongOperations);


        float G = 888.77f;
        float H = 77.55f;
        float resultFloatOperations;
        System.out.println("FLOAT OPERATIONS");
        System.out.println("Variable G equal " + G + " ; " + "Variable H equal " + H);
        resultFloatOperations = G + H;
        System.out.println("Result of adding variables " + resultFloatOperations);
        resultFloatOperations = G - H;
        System.out.println("Result of substraction variables " + resultFloatOperations);
        resultFloatOperations = G * H;
        System.out.println("Result of multiplication variables " + resultFloatOperations);
        resultFloatOperations = G / H;
        System.out.println("Result od division variables " + resultFloatOperations);


        double I = 12345.1234;
        double L = 123.123;
        double resultDoubleOperations;
        System.out.println("DOUBLE OPERATIONS");
        System.out.println("Variable I equal " + I + " ; " + "Variable L equal " + L);
        resultDoubleOperations = I + L;
        System.out.println("Result of adding variables " + resultDoubleOperations);
        resultDoubleOperations = I - L;
        System.out.println("Result of substraction variables " + resultDoubleOperations);
        resultDoubleOperations = I * L;
        System.out.println("Result of multiplication variables " + resultDoubleOperations);
        resultDoubleOperations = I / L;
        System.out.println("Result of division variables " + resultDoubleOperations);
    }
}