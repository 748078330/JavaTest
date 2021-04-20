public class Array {
    public static void main(String[] args) {
        int lt1 = 0;
        int lt2 = 0;
        int lt3 = 0;
        int[][] lt = new int[][]{{63, 95, 86, 77, 59}, {100, 63, 69, 74, 99}, {82, 91, 67, 52, 100}};
        for (int l = 0; l < lt.length; l++) {
            System.out.println("********第" + (l + 1) + "个班********");
            lt1 = 0;
            for (int t = 0; t < lt[l].length; t++) {
                lt1 += lt[l][t];
                lt2 += lt[l][t];
                lt3++;
            }
            System.out.println(lt1);
        }
        System.out.println("所有班级的平均值" + (lt2 / lt3));
    }
}
