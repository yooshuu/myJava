public class Mid_test_01 {
    public static void main(String[] args) {

        // i는 출력할 행 번호
        for(int i=1; i<=4; i++) {

            // j는 현재 행에서 출력해야 할 공백의 개수
            // 전체 4행 중 i가 증가할수록 공백은 줄어들어야 하므로 (4-i)로 설정
            for(int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }

            // k는 현재 행에서 출력할 *(별)의 개수
            // i가 증가할 수록 별은 2개씩 증가해야하므로 (2*i-1)로 설정
            for(int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }

            // 한 행의 공백과 별 출력이 끝났으므로 줄바꿈하여 다음 행으로 이동
            System.out.println();
        }
    }
}