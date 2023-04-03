package example;

public class EX03 {
    public static void main(String[] args) {
        // 7. 각 표현식에 대한 결과 값을 계산하여라. 만일 틀린 식이 있다면 수정하여라.
        // 가.  3 + 4.5 * 2 + 27 / 8
        // 나.  true || false && 3 < 4 || !(5 == 7)
        // 다.  true || (3 < 5 && 6 >= 2)
        // 라.  !true > 'A'
        // 마.  7 % 4 + 3 - 2 / 6 * 'Z'
        // 바.  'D' + 1 + 'M' % 2 / 3
        // 사.  5.0 / 3 + 3 / 3
        // 아.  53 % 21 < 45 / 18
        // 자.  (4 < 6) || true && false || false && (2 > 3)
        // 차.  7 - (3 + 8 * 6 + 3) - (2 + 5 * 2)
        System.out.println("7. 각 표현식에 대한 결과 값을 계산하여라. 만일 틀린 식이 있다면 수정하여라.");
        System.out.printf("가. %.1f\n",3 + 4.5 * 2 + 27 / 8);
        System.out.printf("나. %b\n", true || false && 3 < 4 || !(5 == 7));
        System.out.printf("다. %b\n", true || (3 < 5 && 6 >= 2));
        System.out.printf("라. %b\n", 0 > 1);
        System.out.printf("마. %d\n", 7 % 4 + 3 - 2 / 6 * 22);
        System.out.printf("바. %d\n", 4 + 1 + 13 % 2 / 3);
        System.out.printf("사. %f\n", 5.0 / 3 + 3 / 3);
        System.out.printf("아. %b\n", 53 % 21 < 45 / 18);
        System.out.printf("자. %b\n", (4 < 6) || true && false || false && (2 > 3));
        System.out.printf("차. %d\n", 7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));

//        8. 다음의 자바 문장에 잘못된 부분이 있는지 알아보고,
//                만약 올바르다면 출력결과를, 그렇지 않다면 그 이유를 서술하여라
//
//        가.  System.out.print( " May 13, 1988 fell on day number ");
//
//        나.  System.out.println( ( (13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400
//                - 2 * (1988 / 100) ) % 7 + 7) % 7 );
//        다.  System.out.print( " Check out this line  ");
//        라.  System.out.println( " //hello there " + '9' + 7 );
//        마.  System.out.print( 'H' + 'I' + " is " + 1 + "more example" );
//        바.  System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
//        사.  System.out.print( "Print both of us", "Me too" );
//        아.  System.out.print( "Reverse " + 'I' + 'T' );
//        자.  System.out.print( "No! Here is" + 1 + "more example" );
//        차.  System.out.println( "Here is " + 10 * 10) ) // that’s 100 ;
//        카.  System.out.println( "Not x is " + true ); // that’s true.
//        타.  System.out.print(  );
//        파.  System.out.println;
//        하.  System.out.print( "How about this one" ++ '?' + 'Huh?' );

        System.out.println("8. 다음의 자바 문장에 잘못된 부분이 있는지 알아보고,\n" +
                "//                만약 올바르다면 출력결과를, 그렇지 않다면 그 이유를 서술하여라");
        System.out.print( " May 13, 1988 fell on day number \n"); // print 메소드 : 따옴표안의 문자열, 변수 값을 출력한다.
        System.out.println( ( (13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100) ) % 7 + 7) % 7 ); // println 메소드 : 따옴표안의 문자열, 변수 값을 출력한 뒤 커서를 다음 줄로 이동한다.
        System.out.print( " Check out this line  \n");
        System.out.println( " //hello there " + '9' + 7 ); // 이 경우 연산자 우선순위가 문자열 결합이 산술 연산보다 우선순위가 높다. 먼저 문자열 결합이 이루어지고, 다음 7은 문자열로 명시적 형변환이 일어나게 된다.
        // 참고 암시적 형변환 순서. 작은 자료형에서 큰 자료형으로 형 변환을 수행하는 경우 암시적 형 변환이 이루어집니다. byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
        System.out.print( 'H' + 'I' + " is " + 1 + "more example\n" );
        System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example\n" );
        System.out.print( "Print both of us" + "Me too\n" ); // print 메소드는 인자로 하나의 값을 받을 수 있다.
        System.out.print( "Reverse " + 'I' + "T\n" );
        System.out.print( "No! Here is" + 1 + "more example\n" );
        System.out.println( "Here is " + 10 * 10 ); // Here is 100
        System.out.println( "Not x is " + true ); // Not x is true.
        System.out.print(" \n");
        System.out.println(" ");
        System.out.print( "How about this one" + '?' + " Huh?\n" );

        //9. 각 부울 표현식에 대한 값을 계산하여라. 자바는 단축식 평가
        //short-circuit evaluation을 사용한다는 점에 주의하여라.

        //가.   true && false && true || true          나. true || true && true && false
        //다.   (true && false) || (true && ! false) || (false && !false)
        //라.   (2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4
        //마.   6 == 9 || 5 < 6 && 8 < 4 || 4 > 3
        System.out.println("9. 각 부울 표현식에 대한 값을 계산하여라.");
        System.out.printf("가. %b\n", true && false && true || true); // true
        System.out.printf("나. %b\n", true || true && true && false); // true
        System.out.printf("다. %b\n", (true && false) || (true && ! false) || (false && !false)); // true
        System.out.printf("라. %b\n", (2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4); // true
        System.out.printf("마. %b\n", 6 == 9 || 5 < 6 && 8 < 4 || 4 > 3); // true


    }


}
