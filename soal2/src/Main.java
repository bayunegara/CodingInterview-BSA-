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
        int[] num1 = new int[]{11,2,4};
        int[] num2 = new int[]{4,5,6};
        int[] num3 = new int[]{10,8,12};
        int A = 0;
        int B = 0;
        for(int i=0; i<num1.length; i++) {
            if(i == 0) {
                A = num1[0];
                B = num1[2];
            } else if(i == 1) {
                A = A+num2[1];
                B = B+num2[1];
            } else {
                A = A+num3[2];
                B = B+num3[0];
            }
        }
        System.out.println("Jumlahkan diagonal kekanan, A = "+A);
        System.out.println("Jumlahkan diagonal kekiri, B = "+B);
        int C = A + B;
        System.out.println("Jumlahkan kedua hasil diagonal A + B = "+C);
    }
}
