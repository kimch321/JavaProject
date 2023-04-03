package example;

import java.util.Random;
import java.util.Scanner;
//출력대상 : 도서명, 저자, 역자, 출판사, 출간일, 정가, 판매가, 할인율, 적립금
class BookInfo {
    static String bookName = "누구나 알기쉬운 자바:입문편";
    static String author = "카와바 타케시";
    static String translator = "하전일";
    static String Publisher = "자유롭게";
    static String publDate = "2014-06";
    static int bookPrice = 25000;
    static int salePrice = 22500;
    static double rate = 0.1;
    static int mileage = 2250;

}

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // 11. 이름과 몸무게, 나이를 변수로 선언하고 자신의 것을 값으로 초기화하는 프로그램을 작성하여라 (MyInfo)
//
//        System.out.println("이름은? ");
//        String name = sc.next();
//        System.out.println("몸무게는? ");
//        double weight = sc.nextDouble();
//        System.out.println("나이는? ");
//        int age = sc.nextInt();
//
//        System.out.printf("%s님의 몸무게는 %.2f,나이는 %d입니다.",name,weight,age);

        // 12. 생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라. (MyAge) // 다 풀고 만나이도 생각해보자.
//        System.out.println("생년월일은? ex)19920511");
//        int birthDay = sc.nextInt();
//        int birthYear = birthDay/10000;
//        int age = 2023-birthYear+1;
//        System.out.printf("한국식 나이는 %d",age);
//        sc.close();

        // 13. 구구단 중 7단을 출력하는 프로그램을 작성하여라. (GuGu7Dan)
        int stn = 7;

        for(int i = 1; i <= 9; i++) {
            System.out.printf("7 x "+i+" = %d\n",i*stn);
        }

//        14. 다음 조건을 만족하는 프로그램을 작성하여라 (TimeTime)
//
//        14.1 하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
//        14.2 한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
//        14.3 일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.

        System.out.printf("14.1 %d일\n",(1234567890%86400 == 0) ? 1234567890/86400 : 1234567890/86400+1);
        System.out.printf("14.2 %d시간\n", 98765/3600);
        System.out.printf("14.2 %d분\n", 12345/60);

        //15. 다음의 조건에 따라 아래의 도서 정보를 출력하는 프로그램을 작성하여라.
        //
        //출력대상 : 도서명, 저자, 역자, 출판사, 출간일, 정가, 판매가, 할인율, 적립금
        //
        //클래스이름 : BookInfo

        System.out.println(BookInfo.bookName);
        System.out.println(BookInfo.author);
        System.out.println(BookInfo.translator);
        System.out.println(BookInfo.Publisher);
        System.out.println(BookInfo.publDate);
        System.out.println(BookInfo.bookPrice);
        System.out.println(BookInfo.salePrice);
        System.out.println(BookInfo.rate);
        System.out.println(BookInfo.mileage);

        //16. 고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
        // 즉, 잔돈을 돌려주기 위해 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
        // 몇 개 필요한지 계산하는 것이다. (Charge)

//        System.out.println("금액을 입력하세요.");
//        int money = sc.nextInt();
//
//        int oman = money/50000;
//        int man = money%50000/10000;
//        int ochun = money%50000%10000/5000;
//        int chun = money%50000%10000%5000/1000;
//        int obak = money%50000%10000%5000%1000/500;
//        int bak = money%50000%10000%5000%1000%500/100;
//        int osip = money%50000%10000%5000%1000%500%100/50;
//        int sip = money%50000%10000%5000%1000%500%100%50/10;
//        int other = money%50000%10000%5000%1000%500%100%50%10;
//
//        System.out.printf("50000원 : %,d, 10000원 : %,d, 5000원 : %,d, 1000원 : %,d, 500원 : %,d, 100원 : %,d, 50원 : %,d, 10원 : %,d, 나머지 금액: %d\n",oman,man,ochun,chun,obak,bak,osip,sip,other);

//        25. 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)
//
//        가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey) 0~9,3
//        나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
//        다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
//        라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력

        System.out.println("0~9 사이 첫번째 숫자를 입력하세요.");
        int yourkey1 = sc.nextInt();
        System.out.println("0~9 사이 두번째 숫자를 입력하세요.");
        int yourkey2 = sc.nextInt();
        System.out.println("0~9 사이 세번째 숫자를 입력하세요.");
        int yourkey3 = sc.nextInt();

        if(yourkey1/10 != 0 || yourkey2/10 != 0 || yourkey3/10 != 0 ) {
            System.out.println("한자리 정수를 입력하세요.");
        } else {
            Random rand = new Random();

//            int lottokey1 = rand.nextInt(10);
//            int lottokey2 = rand.nextInt(10);
//            int lottokey3 = rand.nextInt(10);
            int lottokey1 = 2;
            int lottokey2 = 3;
            int lottokey3 = 4;

            if(yourkey1 == lottokey1) { // 1==1
                if(yourkey2 == lottokey2) { // 1==1,2==2
                    if(yourkey3 == lottokey3) { // 1==1,2==2,3==3
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 당첨! 100만원 지급! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    } else { // 1==1,2==2,3!=3 3낙첨.
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    }
                } else if(yourkey2 == lottokey3) { // 1==1,2==3
                    if(yourkey3 == lottokey2) {// 1==1,2==3,3==2
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 당첨! 100만원 지급! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    } else { // 1==1, 2==3, 3!=2 3낙첨
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    }
                } else{ // 1==1, 2 낙첨
                    System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                }

            } else if(yourkey1 == lottokey2){ // 1==2
                if(yourkey2 == lottokey1) { // 1==2, 2==1
                    if(yourkey3 == lottokey3) { // 1==2, 2==1, 3==3
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 당첨! 100만원 지급! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    } else { // 1==2, 2==1, 3!=3 3 낙첨
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    }
                } else if(yourkey2 == lottokey3){ // 1==2, 2==3
                    if(yourkey3 == lottokey1) { // 1==2, 2==3, 3==1
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 당첨! 100만원 지급! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    } else { // 1==2, 2==3, 3!=1 낙첨
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    }
                } else { // 1==2, 2 낙첨
                    System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                }
            } else if(yourkey1 == lottokey3) { // 1==3
                if(yourkey2 == lottokey1) { // 1==3, 2==1
                    if(yourkey3 == lottokey2) { // 1==3, 2==1, 3==2
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 당첨! 100만원 지급! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    } else { // 1==3, 2==1, 3!=2
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    }
                } else if(yourkey2 == lottokey2){ // 1==3, 2==2
                    if(yourkey3 == lottokey1) { // 1==3, 2==2, 3==1
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 당첨! 100만원 지급! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    } else {// 1==3, 2==2, 3!=1
                        System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                    }
                } else { // 1==3, 2 낙첨.
                    System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
                }

            } else { // 1 낙첨
                System.out.printf("당신이 선택한 키 %d,%d,%d. 추첨키 %d,%d,%d. 다음 기회를! \n",yourkey1,yourkey2,yourkey3,lottokey1,lottokey2,lottokey3);
            }



        }





    }
}
