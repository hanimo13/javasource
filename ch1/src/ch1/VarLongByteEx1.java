package ch1;

// 000(){}는 메소드라고 부른다
// byte : 8비트
// 숫자 표현 : 2의8승=256. 음수부터 표현 256/2 => -128 ~ 127 까지 표현 가능

public class VarLongByteEx1 {
    public static void main(String[] args) {
        // 변수
        // 기본타입: 정수형, 문자형, 실수형, 불린형
        // 정수형: byte(1), short(2), int(4), long(8)
        // 문자형: char(2)
        // 실수형: float(4), double(8)
        // 불린형: boolean(1)

        // 상수 : 값을 한번만 저장
        // 타입 상수명 = 값; final int MAX_VALUE = 100;

        // 변수선언: 타입 변수명 = 값;
        // 변수명 : 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다
        // max-speed : 데이터베이스 필드명
        // long : L,l 붙이기 
        long age = 15L, maxSpeed = 100L;
        long max = 256L;


        long money = 1000000000000L;

        // System.out.println(age);
        // System.out.println(maxSpeed);
        // + :연산,연결(문자)
        // 변수값 변경할땐 변수명만 불러오고 앞에 int같은거 안씀
        age = 30;

        System.out.println("나이 : "+ age + ", 최고속도 : " + maxSpeed + ", max : "+ max );
        System.out.println(age + maxSpeed + max);
        System.out.println(money);

    }
}
