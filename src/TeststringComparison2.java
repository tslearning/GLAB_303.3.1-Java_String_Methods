public class TeststringComparison2 {
    public static void main(String[] args) {
        //17.	By Using == operator
        //The == operator compares references, not values.
        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = new String("Perscholas");
        System.out.println(s1 == s2); // true (because both refer to same instance)
        System.out.println(s1 == s3); // false(because s3 refers to instance created in nonpool)
    }
}
