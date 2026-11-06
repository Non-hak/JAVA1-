//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String result;
    final int SIZE = 30;

    for (int i = 1; i <= SIZE; i ++) {
        while (true) {   //Event 무한루프
            System.out.printf("%d번 학생 출석했나요?: (Yes/No)", i);
            char answer = keyboard.nextLine().charAt(0);
            if (answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n')
                break;    //빠져나오기 (반드시 필요)
            else {
                System.out.print("ERROR: 입력 오류");
                System.in.read();
            }
            if (answer == 'Y' || answer == 'y') {
                result = "출석";
            } else {
                result = "결석";
            }

            System.out.printf("%d번 학생은 %s 입니다.\n", result, i);
        }
    }