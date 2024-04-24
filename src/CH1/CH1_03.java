package CH1;
import java.util.*;

public class CH1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCount(a); // a문자열의 알파멧을 기록하는 배열
        int[] countB = getAlphabetCount(b); // b문자열의 알파벳을 기록하는 배열

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            // a 와 b 차를 구하여 카온팅함
            ans += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(ans);
    }
    public static int[] getAlphabetCount(String str) {
        // 소문자 26개 이므로 기준으로 int 배열생성
        int[] count = new int[26];
        // 기준 스트링에 인덱스 값에 - a를 하게된 카운트를 세줌
        // 공통부분을 제외한 나머지 개수를 센다
        for (int i = 0; i < str.length(); i++) {
            // 26칸 즉 소문자안에 들어올수 있게 처리함
            count[str.charAt(i) - 'a']++;
        }
        return count;
    };
}
