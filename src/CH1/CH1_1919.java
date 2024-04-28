package CH1;
import java.util.*;

// https://www.acmicpc.net/problem/1919
public class CH1_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCount(a); // a문자열의 알파멧을 기록하는 배열
        int[] countB = getAlphabetCount(b); // b문자열의 알파벳을 기록하는 배열

        System.out.println("Count A" + Arrays.toString(countA));
        System.out.println("Count B" + Arrays.toString(countB));

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            // a 와 b 차를 구하여 카온팅함
            ans += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(ans);
    }
    public static int[] getAlphabetCount(String str) {
        // 소문자 26개 이므로 기준으로 int 배열생성
        int [] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    };
}
