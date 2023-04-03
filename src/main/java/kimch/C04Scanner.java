package kimch;

import java.util.Scanner;                       // 1

public class C04Scanner {
    public static void main(String[] args) {
        // 데이터 입력 : Scanner
        Scanner sc = new Scanner(System.in);    // 2

        // 이름을 입력받음
        System.out.print("이름은? ");
        String name = sc.next();                // 3

        // ex) 성적 처리프로그램 v2
        // 이름, 국어, 영어, 수학을 키보드로 입력받아
        // 총점, 평균, 학점을 계산한 뒤 결과 출력
        System.out.print("국어 점수는? ");
        int kor = sc.nextInt();
        System.out.print("영어 점수는? ");
        int eng = sc.nextInt();
        System.out.print("수학 점수는? ");
        int math = sc.nextInt();

        int total = kor + eng + math;
        // double avg = total / 3.0; // 정수를 정수로 나누면 결과도 정수
        double avg = total / 3.0; //정수를 실수로 나누면 결과는 실수

//        if(avg >= 90) {
//            grade = '수';
//        } else if(avg >= 80) {
//            grade = '우';
//        } else if(avg >= 70) {
//            grade = '미';
//        } else if(avg >= 60) {
//            grade = '양';
//        } else {
//            grade = '가';
//        }

        // int swichAvg = (int)avg/10;
        char grade = avg >= 90 ? '수' : avg >=80 ? '우' : avg >=70 ? '미' : avg >= 60 ? '양' : '가';
//        switch (swichAvg) {
//            case 10 :
//            case 9 :
//                grade = '수';
//            break;
//            case 8 : grade = '우';
//            break;
//            case 7 : grade = '미';
//            break;
//            case 6 : grade = '양';
//            break;
//            default: grade = '가';
//            break;
//        }

        System.out.printf("%s님의 평균은 %.1f 이고, 학점은 %s 입니다.\n", name, avg, grade);

        // 종료시 sc 객체 제거
        sc.close();                             // 4
    }
}
