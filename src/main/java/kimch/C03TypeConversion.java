package kimch;

public class C03TypeConversion {
    public static void main(String[] args) {
        // 자료형 변환
        // 암시적 형변환 (auto)
        // 명시적 형변환 (casting)

        // 묵시적 형변환
        byte z = 10; // byte는 1byte크기의 자료형
        int a = z;   // int는 4byte 크기 자료형 (승격)
        // int a = (int)z; // 변수 승격시 명시적 형변환 사용은 필요하지 않음.

        System.out.printf("%d %d\n",z,a);

        // 명시적 형변환 : cast 연산자 사용!
        // 자료형 변수명A = (변환할 자료형) 변수명B;
        z = (byte)a;
        System.out.printf("%d %d\n",z,a);

        // 정보 손실의 예
        // 오버플로우
        a = 512;
        z = (byte)a;
        System.out.printf("%d %d\n",z,a);

        // 소수점이하 손실
        double b = 3.14;
        long c = (long)b;
        System.out.printf("%f, %d\n",b , c);

        // 의도적인 형변환
        // 정수끼리 산술연산 결과 : 정수
        // 하지만, 정수끼리 산술연산 결과를 실수로 얻고 싶다면 - 형변환 필요!
        int x = 96;
        int y = 99;

        // System.out.printf("98 / 99 = %f\n", x / y);
        System.out.printf("98 / 99 = %f\n", (double)(x) / y);

        // 문자열 연산 : +
        // printf 메서드를 사용할 것을 추천! bc. 성능 문제가 있다고 한다.
        String name = "홍길동";
        System.out.println("나의 이름은 : " + name);
        System.out.printf("나의 이름은 : %s\n", name);

        // 삼항 연산자 : if 문의 syntatic sugar
        // 조건식 ? 참일때의 값 : 거짓일때의 값

        // ex) 평균점수 60 이상이면 '합격'
        // 아니면 '불합격'이라 출력

        double avg = 68.5;
        String result;
        result = (avg >= 60) ? "합격" : "불합격";
        String fmp = "평균점수가 %.2f라면 결과는 %s 입니다.";

        System.out.printf(fmp,avg,result);

    }
}
