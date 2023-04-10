package example;

import java.util.Random;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        // Q25 - 복권 발행 프로그램 : Lotto
        // 위치에 상관없이 숫자만 맞으면 일치하는 것으로 인정!
        // 123 - 345  : 1개 일치
        // 365 - 531  : 2개 일치
        /*Scanner sc = new Scanner(System.in);
        String lottokey = "856";
        System.out.print("복권숫자는? ");
        String yourkey = sc.next();
        int match = 0;    // 일치여부
        char key = yourkey.charAt(0);  // 첫번째 숫자 비교
        if (key == lottokey.charAt(0) ||
                key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        key = yourkey.charAt(1);      // 두번째 숫자 비교
        if (key == lottokey.charAt(0) ||
                key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        key = yourkey.charAt(2);      // 세번째 숫자 비교
        if (key == lottokey.charAt(0) ||
                key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        String result = "아쉽지만, 다음 기회를!";
        if (match == 3) result = "당첨! 상금 100만원 지급!!";
        System.out.printf(
            "복권번호 : %s, 입력한 번호 : %s\n",  lottokey, yourkey);
        System.out.printf(
            "당첨여부 : %d개 일치, 결과여부 : %s \n", match, result);*/


        // Q25 - 복권 발행 프로그램 : Lotto v2
        Scanner sc = new Scanner(System.in);

        Random rnd = new Random();   // 난수생성을 위한 객체 정의
        String lottokey = "";

        // nextInt(경계값) : 0 ~ 경계값-1 사이의 정수 난수 출력
        // 1 ~ 9 사이 임의의 정수 3개를 난수로 생성
        for (int i = 0; i < 3; i++) {
            lottokey += rnd.nextInt(9) + 1;
        }

        System.out.print("복권숫자는? ");
        String yourkey = sc.next();

        int match = 0;    // 일치여부
        // 첫번째 숫자 비교

        for (int i = 0; i < 3; i++) {
            char key = yourkey.charAt(i);
            if (key == lottokey.charAt(0) ||
                    key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        } // 당첨여부 확인

        String result = "아쉽지만, 다음 기회를!";
        if (match == 3) result = "당첨! 상금 100만원 지급!!";

        System.out.printf(
                "복권번호 : %s, 입력한 번호 : %s\n",  lottokey, yourkey);
        System.out.printf(
                "당첨여부 : %d개 일치, 결과여부 : %s \n", match, result);


        // Q30 - 숫자 맞추기 CatchNumber
        rnd = new Random();    // 난수생성을 위해 다시 초기화
        int num2 = rnd.nextInt(100) + 1;  // (0 ~ 99) + 1

        /*for (int i = 0; i < 30; i++) {
            System.out.print("숫자는(1~100)? ");
            int num1 = sc.nextInt();
            result = "";
            if (num1 > num2) result = "추측한 숫자가 큽니다!";
            else if (num1 < num2) result = "추측한 숫자가 작습니다!";
            else if (num1 == num2) {
                result = "빙고! 숫자를 맞췄습니다";
                System.out.println(result);
                break;
            }
            System.out.println(result);
        }*/

        // Q32 - CheckNumber
        System.out.print("값은? ");
        int val = sc.nextInt();

        result = "";
        if (val >= 20000 && val < 30000) result = "20000~30000사이";
        else if (val >= 10000) result = "10000~20000사이";
        else if (val < 10000) result = "10000미만";
        else result = "범위 밖 값";

        System.out.println(result);


        // Q48 - 복리계산 ComputeInvestment
        int account = 25000;      // 잔액
        double interest = 0.06;   // 연 이율

        String fmt = "%2d 년차 통장 잔액 : %d\n";
        int limit = account * 2;

        for (int i = 1; i <= 20; i++) {
            account = account + (int)(account * interest);
            System.out.printf(fmt, i, account);
            if (account >= limit) break;
        }


    }
}