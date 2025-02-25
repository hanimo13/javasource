package ch1;

// 000(){}는 메소드라고 부른다
// byte : 8비트
// 숫자 표현 : 2의8승=256. 음수부터 표현 256/2 => -128 ~ 127 까지 표현 가능

public class VarByteEx2 {
    public static void main(String[] args) {
        // 변수
        // 기본타입: 정수형, 문자형, 실수형, 불린형
        // 정수형: byte(1), short(2), int(4), long(8)
        // 문자형: char(2)
        // 실수형: float(4), double(8)
        // 불린형: boolean(1)

        // 변수선언: 타입 변수명 = 값;
        // 변수명 : 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다
        // max-speed : 데이터베이스 필드명
        int age = 15, maxSpeed = 100;
        int max = 256;
        // System.out.println(age);
        // System.out.println(maxSpeed);
        // + :연산,연결(문자)
        // 변수값 변경할땐 변수명만 불러오고 앞에 int같은거 안씀
        age = 30;

        System.out.println("나이 : "+ age + ", 최고속도 : " + maxSpeed + ", max : "+ max );
        System.out.println(age + maxSpeed + max);

        //형식화된 출력(엔터는 안들어가 있음)
        // %b : boolean, %d : 정수, %f : 실수, %s : 문자열, %c : 문자
        System.out.printf("나이 : %d, 최고속도 : %d , max : %d\n" ,age,maxSpeed,max );
    }
}
