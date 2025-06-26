package DSA;

public class GCD_EuclideanAlgorithm {
    public static void main(String[] args) {
        System.out.println(gcd(125, 15));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
