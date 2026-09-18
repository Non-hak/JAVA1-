//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("나이를 입력하세요: ");
    int age = scanner.nextInt();

    System.out.print("체중(kg)을 입력하세요: ");
    double weight = scanner.nextDouble();

    System.out.print("신장(cm)을 입력하세요: ");
    double height = scanner.nextDouble();

    System.out.printf("나이는 %d살 입니다.\n", age);
    System.out.printf("체중은 %.1f cm 입니다.\n", weight);
    System.out.printf("신장은 %.1f kg 입니다.\n", height);
}