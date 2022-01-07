/**
 * Soal 1
 * Buat sebuah program / function untuk mengecek apakah sebuah kata, frasa dapat dibaca dengan sama, baik dari depan maupun belakang.
 * Input : berupa kata
 * Output : True jika bisa dibaca dengan sama, False bila tidak
 */
public class Main {
    public static void main(String[] args) {
        String text = "katak";
        int j = 0;
        boolean result = false;
        for(int i = text.length(); i > 0; i--) {
            if(text.substring(i-1,i).equals(text.substring(j,j+1))){
                result = true;
            }
            j++;
        }
        System.out.println(result);
    }
}
