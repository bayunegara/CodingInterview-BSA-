/**
 * Soal 1
 * Buat sebuah program / function untuk mengecek apakah sebuah kata, frasa dapat dibaca dengan sama, baik dari depan maupun belakang.
 * Input : berupa kata
 * Output : True jika bisa dibaca dengan sama, False bila tidak
 */
public class Main {
    public static void main(String[] args) {
        String text1 = "katak";
        int i;
        String result = "";
        for(i = text1.length(); i > 0; i--) {
            String huruf = text1.substring(i-1,i);
            result += huruf;
        }
        if(text1.equals(result.toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
