//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("가로 길이를 입력하세요: ");
    int width = scanner.nextInt(); // 가로

    System.out.print("세로 길이를 입력하세요: ");
    int depth = scanner.nextInt(); // 세로

    System.out.print("높이 길이를 입력하세요: ");
    int height = scanner.nextInt(); // 높이

    // 직육면체의 부피 = 가로 × 세로 × 높이
    int volume = width * depth * height;

    System.out.println("직육면체의 부피: " + volume);
}