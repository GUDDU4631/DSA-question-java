
public class bitminupulation {
    // AND operation
    public static void And(int a, int b) {
        System.out.print(a & b);
    }

    // OR operation
    public static void Or(int a, int b) {
        System.out.print(a | b);
    }

    // XOR operation
    public static void XOR(int a, int b) {
        System.out.print(a ^ b);
    }

    // 1's compliment operation
    public static void onesCompliment(int a) {
        System.out.print(~a);
    }

    // left shift operation
    public static void leftShift(int a, int i) {
        System.out.print(a << i);
    }

    // right shift operation
    public static void rightShift(int a, int i) {
        System.out.print(a >> i);
    }

    public static void getBit(int n, int i) {
        System.out.println(n & (1 << i));

        // 1 << 2 = 100 (4)
        // 5 = 101
        // ----------------
        // 101 & 100 = 100 (4)

        if ((n & (1 << i)) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void setBit(int n, int i) {
        System.out.print(n | (1 << i));
        // Index: 3 2 1 0
        // Bits : 1 0 0 0 (8)

        // Set bit at index 2:

        // Index: 3 2 1 0
        // Bits : 1 1 0 0 (12)
    }

    public static void clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        System.out.print(n & bitMask);
        // 1000 (8)
        // & 1011 (mask)
        // ------
        // 1000 (8)
    }

    public static void updateBit(int n, int i, int newBit) {
        // first operation

        // if (newBit == 0) {
        // clearBit(n, i);
        // } else {
        // setBit(n, i);
        // }

        // second operation
        n = n & (~(1 << i));
        System.out.print(n | (1 << i));
    }

    public static void clearLastBit(int n, int i) {
        int bitMask = (~0) << i;
        System.out.print(n & bitMask);
        // 0101 (5)
        // 1100 (~3, showing only the last 4 bits)
        // ----
        // 0100 (4)

    }
    public static void clearIBit(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        System.out.print(n&(a|b));
    }

    public static void main(String agr[]) {
        // And(4,5);
        // Or(6,5);
        // XOR(6,5);
        // onesCompliment(5);
        // leftShift(5,2);
        // rightShift(5,2);
        // getBit(5,2);
        // setBit(8, 2);
        // clearBit(8, 2);
        // updateBit(8, 2, 1);
        // clearLastBit(5, 2);
        clearIBit(5,2,3);
    }
}