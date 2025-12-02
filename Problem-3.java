// Problem-3.java
// Observed rule from examples:
// - If a is odd -> output first a odd numbers (count = a)
// - If a is even -> output first (a - 1) odd numbers (count = a-1)

class Problem3 {
    public static int[] patternForA(int a) {
        if (a <= 0) return new int[0];
        int n = (a % 2 == 1) ? a : (a - 1);
        if (n <= 0) return new int[0];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[i] = 2 * i + 1;
        return res;
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 5, 6};
        for (int a : tests) {
            int[] out = patternForA(a);
            System.out.print("input a = " + a + " -> output: ");
            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i]);
                if (i < out.length - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}
