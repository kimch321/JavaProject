package kimch;

import java.util.ArrayList;
import java.util.Scanner;

public class J07Array {
    public static void main(String[] args) {
        // 배열
        // 동일한 자료형의 자료를 여러개 저장히기 위한 자료구조
        // 데이터 입력 순서 기억, 중복자료 저장 가능
        // 자바에서 배열을 다룰 때는 배열의 크기, 인덱스, 배열의 값 등에 주의하여 사용해야 합니다.
        // 배열의 크기 : 자바에서 배열은 고정크기 자료구조이며, 한번 설정한 크기는 변경 불가합니다.

        // 점심메뉴 정의 - 배열
        // 배열 정의 방법1
        String[] menu = new String[]{"라면", "자장면", "탕수육", "민트초코", "떡볶이"};

        // 배열 정의 방법2
        String[] menu2 = {"라면", "자장면", "탕수육", "민트초코", "떡볶이"};

        // 배열을 선언하고 크기를 지정하는 방법
        String[] menu3 = new String[5];

        menu3[0] = "라면";
        menu3[1] = "자장면";
        menu3[2] = "탕수육";
        menu3[3] = "민트초코";
        menu3[4] = "떡볶이";

        // 그 외의 방법 (변수 뒤 [])
        String menu4[] = {"라면", "자장면", "탕수육", "민트초코", "떡볶이"};

        // 출력 for i 탭(node 환경에서는 안되는데, 아마 emmet 단축키와 충돌해서 그런 것 같다.)
        for (int i = 0; i < menu.length; i++) {
            System.out.printf(menu4[i] + " ");
            if(i == menu.length-1) System.out.println("");
        }

        // 점심 메뉴 정의 - ArrayList
        // ArrayList는 collention 프레임워크의 한 요소이다.
        // ArrayList는 크기가 동적으로 결정되는 자료구조이다.
        // ArrayList<자료형> 변수명 = new ArrayList<>();
        ArrayList<String> menu5 = new ArrayList<>();

        menu5.add("라면");
        menu5.add("자장면");
        menu5.add("탕수육");
        menu5.add("민트초코");
        menu5.add("떡볶이");

        // ArrayList는 length속성이 없다. 대신 size() 메서드를 사용해야 한다.
        for (int i = 0; i < menu5.size(); i++) {
            System.out.printf(menu5.get(i) + " ");
            if(i == menu5.size()-1) System.out.println("");
        }

        // 5개의 정수를 입력받아 총합, 평균을 구하고 결과 출력 v3
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;

        for (int i = 0; i < nums.length; ++i) {
            System.out.print(i+1 + "번째 숫자는? ");
            nums[i] = sc.nextInt();
            sum += nums[i];             // 누적합
        }
        double avg = sum / 5;

        for (int i = 0; i <= nums.length; i++) {
            if(i == 0) {
                System.out.printf("입력하신 숫자는 ");
            } else {
                System.out.printf("%d, ", nums[i-1]);
                if(i == nums.length) {
                    System.out.printf("이고\n");
                }
            }
        }
        System.out.printf(
                "총합은 %d, 평균은 %.1f 입니다\n", sum, avg);



    }
}
