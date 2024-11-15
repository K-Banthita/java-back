public class Operator {
    public static void arithmetic() {
        var add = 10 + 2;
        var minus = 10 - 2;
        var multiply = 10 * 2;
        var divide = 10 / 2;
        var modulo = 10 % 2;
    }

    public static void relational() {
//    relational or comparison
        var isEqual = 10 == 10;
        var isNotEqual = 10 != 10;
        var isGreaterThan = 25 > 10;
        var isGreaterThanEqual = 25 >= 25;
        var isLessThan = 20 > 25;
        var isLessThanEqual = 20 <= 20;
    }

    public static void logical() {
        var score = 85;
        var isScoreGreaterThanEqualZero = score >= 0;
        var isScoreLessThanEqualHundred = score <= 100;
//      AND - both of them true = true
        var isInGradeScore = isScoreGreaterThanEqualZero && isScoreLessThanEqualHundred;
//      OR - Either of them true = true
        var day = 23;   // 5-10 / 20-25
        var isGoToMall = (day >= 5 && day <= 10) || (day >= 20 && day <= 25);
//      JAVA Short Circuit
        /*
        AND - Left is False => False
        OR - Left is True => True
        */
//      NOT
        var isEnable = !true;
    }

    public static void bitwise() {
//  Example - assume unsigned 4 bits: 0 - 15

        var exampleValue1 = 7; // 111
        var exampleValue2 = 3; // 011
        // & bitwise AND
        System.out.println("AND: " + (exampleValue1 & exampleValue2));
//        | bitwise OR
        System.out.println("OR: " + (exampleValue1 | exampleValue2));
//        ^ bitwise XOR
        System.out.println("XOR: " + (exampleValue1 ^ exampleValue2));
//        ~ bitwise complement
        /*  sign: 0 positive 1 negative
        7 => 0      111
        2's complement: (convert bits) +1
       -7 => 1      001

       ~ = 1's complement (convert bits)
       7 => 1 000 = -8
       3 => 1 100 = -4
         */
        System.out.println("~: " + ~exampleValue1);
        System.out.println("~: " + ~exampleValue2);
        // 7 => 0 111 -7 => 1 001 = -8: ~-7 => 0 110 = 6
        System.out.println("~-7: " + ~-7);
//        << left shift
        System.out.println("7 << 2: " + (7 << 2));
//        >> right shift
        // signed, unsigned
    }

    public static void assignment() {
//  Assign value to varible
        var day = 25;
//  Combination arithmetic + assignment
        var amount = 20;
        amount += 2;
        System.out.println(STR."Current Amount: \{amount}");
    }

    public static void unary() {
//Incremental / Decremental
        /*
        in front - do operation before execution of variable
        in back - do operation after execution of variable
         */
        var day = 10;
        day++;
        System.out.println(STR."current day = \{day}");
        day--;
        System.out.println(STR."current day = \{day}");

        var score = 100;
        System.out.println(STR."current score = \{++score}");
        score = 100;
        System.out.println(STR."current score = \{score++}");
        System.out.println(STR."current score = \{score}");
    }

    public static void terrany() {
//        If - Else
        var score = 85;
//        Consider PASS / NOT PASS
//        if (score >= 80) {
//            PASS
//        } else {
//            NOT_PASS
//        }
        var grade = (score >= 80) ? "PASS" : "NOT PASS";
        System.out.println(STR."Grade: \{grade}");
//

    }

    public static void main(String[] args) {
        arithmetic();
        relational();
        logical();
        assignment();
        unary();
        terrany();
        bitwise();
    }
}
