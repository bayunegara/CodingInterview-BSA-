/**
 * Buat aplikasi penjumlahan diagonal array 3 x 3
 * Contoh :
 * 11 2 4
 * 4 5 6
 * 10 8 12
 *
 * Jumlahkan diagonal kekanan, A = 11 + 5 + 12 = 28
 * Jumlahkan diagonal kekiri, B = 4 + 5 + 10 = 19
 * Jumlahkan kedua hasil diagonal A + B = 28 + 19 = 47
 */
public class Main {
    public static void main(String[] args) {
        int[][] num = {{11, 2, 4},
                        {4, 5, 6},
                        {10, 8, 12},};
        int A = 0;
        int B = 0;
        int j = 0;
        int k = num.length-1;
        for(int i=0; i<num.length; i++) {
                A = A + num[i][j];
                B = B + num[i][k];
                j++;
                k--;
        }
        System.out.println("Jumlahkan diagonal kekanan, A = "+A);
        System.out.println("Jumlahkan diagonal kekanan, B = "+B);
        int C = A + B;
        System.out.println("Jumlahkan kedua hasil diagonal A + B = "+C);
    }
}
