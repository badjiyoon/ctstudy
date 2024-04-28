package CH1;
import java.util.*;
// 대소문자 바꾸기
// https://www.acmicpc.net/problem/2744 -> 문제 내용
class CH1_2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }

    public static String solution (String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
//            ans.append(Character.toUpperCase(ch) == ch ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
            ans.append( 'A' <= ch && ch <= 'Z' ? (char) ('a' + ch - 'A') : (char) ('A' + ch - 'a'));
        }
        return ans.toString();
    }
}