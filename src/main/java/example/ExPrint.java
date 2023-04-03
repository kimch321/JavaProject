package example;

public class ExPrint {
    public static void main(String[] args) {
        //1234
        int a = 1234;
        System.out.printf("%d\n",a);
        System.out.printf("%+d\n",a);
        System.out.printf("%10d\n",a);
        System.out.printf("%010d\n",a);
        System.out.printf("%-10d\n",a);
        System.out.printf("%-+10d\n",a);
        System.out.printf("%+10d\n",a);
        System.out.printf("%d\n",-a);
        System.out.printf("%10d\n",-a);
        System.out.printf("%010d\n",-a);
        System.out.printf("%#10o\n",a);
        System.out.printf("%#10x\n",a);
        System.out.printf("%#10X\n",a);
    }
}
