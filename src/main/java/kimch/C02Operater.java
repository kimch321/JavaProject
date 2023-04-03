package kimch;

public class C02Operater {
    public static void main(String[] args) {
        //표현식expression : 리터럴(값), 식별자(변수), 연산자, 함수 호출등의 조합을
        //      의미. 표현식은 평가evaluate(표현식이 실행되어 결과값 생성)되어 하나의 값을
        //      만듬.

        // 산술연산자
        int x = 10, y = 20;

        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x, y, x*y);
        System.out.printf("%d / %d = %d\n", x, y, x/y);
        System.out.printf("%d %% %d = %d\n", y, x, x%y); // %를 출력하기 위해서는 %%를 사용합니다.

        // 관계연산자
        System.out.printf("%d가 %d보다 크나요? : %b\n",x,y,x > y);
        System.out.printf("%d가 %d보다 작나요? : %b\n",x,y,x < y);
        System.out.printf("%d가 %d보다 같나요? : %b\n",x,y,x == y);

        // 논리연산자
        System.out.printf("x < 10 AND x < 20 : %b\n",x < 10 && x< 20);
        System.out.printf("x < 10 OR x < 20 : %b\n",x < 10 || x< 20);
        System.out.printf("NOT(x < 10 AND x < 20) : %b\n", !(x < 10 && x< 20));

        // 🤚🏻 : 자바에선 안되는 것!
        // System.out.printf("1 + true : %b",1 + true);
        // System.out.printf("false + true : %b",false + true);

        // 할당연산자 : syntatic sugar
        System.out.printf("x값은 %d\n", x);

        x += 2; // x + 2;
        System.out.printf("x + 2 = %d\n", x);

        x *= 2; // x * 2;
        System.out.printf("x * 2 = %d\n", x);

        x -= 2; //  x - 2;
        System.out.printf("x - 2 = %d\n", x);

        // 증가, 감소 연산자
        x = 10;
        System.out.printf("++x + 1 = %d\n", ++x + 1); // 12 , x = 12
        x = 10;
        System.out.printf("x++ + 1 = %d\n", x++ + 1); // 11 , x = 12
        x = 10;
        System.out.printf("--x + 1 = %d\n", --x + 1); // 10 , x = 10
        x = 10;
        System.out.printf("x-- + 1 = %d\n", x-- + 1); // 11 , x = 10

    }
}
