public class Mid_test_03 { // 클래스 선언.
    public static void main(String[] args) { // 프로그램의 시작점인 main 메서드

        // 조건에 맞는 숫자들의 합을 나타내기 위한 변수를 선언하고 초기화
        int hap = 0;

        // i=100부터 1씩 증가하여 i<=300까지 반복함
        for(int i=100; i<=300; i++) {

            // 현재 숫자 i가 5의 배수인지(i%5==0), 7의 배수인지(i%7==0) 확인
            // 둘 다 만족하면 문제에서 요구한 숫자에 해당됨
            if(i%5==0 && i%7==0) {

                // 조건을 만족하는 숫자를 hap에 계속 더해 합을 구함
                hap += i;
            }
        }

        // 조건을 만족하는 누적된 최종 합을 출력
        System.out.println(hap);
    }
}