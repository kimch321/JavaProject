package kimch;

public class J12OOP {
    public static void main(String[] args) {
        Person2 p1 = new Person2();

        // 객체 멤버변수 초기화 - 실패 - private 때문
//        p1.name = "혜교";
//        p1.job = "학생";
//        p1.age = 35;
//        p1.gender = '여';

        // setter로 변수 초기화
        p1.setName("혜교");
        p1.setJob("아이돌");
        p1.setAge(35);
        p1.setGender('여');

        // 객체 출력 1
        System.out.println(p1.getName());
        System.out.println(p1.getJob());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());

        // 객체 출력 2
        System.out.println(p1);

    }
}

class Person2 {
    // 멤버변수 캡슐화
    // 접근제한자를 이용해서 멤버변수의 직접 접근을 막음

    public Person2() { }

    // getter / setter 선언
    // private으로 선언된 변수를 외부에 접근할 수 있도록
    // 정의하는 특수한 메서드
    private String name;
    private String job;
    private int age;
    private char gender;


    // getXxx
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString : 모든 멤버변수의 값을 출력할때 사용하는 메서드
    @Override
    public String toString() {
        String fmt = "%s, %s, %d, %s\n";
        return String.format(fmt, name, job, age, gender);
    }
}
