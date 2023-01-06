public final class Dubler {
    public static int[] doubling(int[] arr) {
        int[] res = new int[arr.length * 2];
        int resIndex = 0;
        for (int j : arr)
            res[resIndex++] = res[resIndex++] = j;
        return res;
    }
}
