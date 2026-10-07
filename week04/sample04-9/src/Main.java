//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base; // 삼각형의 밑변
    int height; // 삼각형의 높이
    float area; // 삼각형의 넓이

    System.out.print("삼각형의 밑변은 ? ");
    base = keyboard.nextInt();
    System.out.print("삼각형의 높이는 ? ");
    height = keyboard.nextInt();

    area = base * height / 2.0f;

    System.out.printf("밑변 %dCm, 높이 %d Cm", base, height);
    System.out.printf("인 삼각형 넓이 = %.2f %s\n", area, "\u33A0");
}