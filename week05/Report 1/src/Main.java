//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner (System.in);

    System.out.print("정수 3개 입력: ");
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();
    int c = keyboard.nextInt();

    if (a > 0 && b > 0 && c > 0) {
        System.out.println("모두 양수");
    } else if (a < 0 || b < 0 || c < 0) {
        System.out.println("음수 포함");
    } else if (a == 0 && b == 0 && c == 0) {
        System.out.println("모두 0");
    } else {
        System.out.println("양수와 0 포함");
    }
}