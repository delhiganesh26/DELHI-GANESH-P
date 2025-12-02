// Problem-2.java
// Given integer a, print first a odd numbers: 1,3,5,...

class Problem2 {
    public static int[] firstAOdds(int a) {
        if (a <= 0) return new int[0];
        int[] res = new int[a];
        for (int i = 0; i < a; i++) {
            res[i] = 2 * i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4};
        for (int a : tests) {
            int[] out = firstAOdds(a);
            System.out.print("input a = " + a + " -> output: ");
            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i]);
                if (i < out.length - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}
