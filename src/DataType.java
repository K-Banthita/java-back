public class DataType {

    public static void main(String[] args) {
        //    variables use camelCase
        int exampleOfInterger = 100;
        long exampleOfLong = 100L;
        byte exampleOfByte = 127;
        short exampleOfShort = 100;
        double exampleOfDouble = 25.00;
        float exampleOfFloat = 25.00f;

        char grade = 'D';
        boolean isPass = true;

        System.out.println("exampleOfByte: " + exampleOfByte);
        //    String template
        System.out.println(STR."exampleOfByte: \{exampleOfByte}");
        System.out.println(STR."exampleOfLong: \{exampleOfLong}");
        System.out.println(STR."grade: \{grade}");
        System.out.println(STR."isPass: \{isPass}");
    }
}