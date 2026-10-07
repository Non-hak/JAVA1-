//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    float interest1, interest2;
    int total;
    int tax;


    System.out.print("첫 번째 통장의 이자를 입력 (예: 1500.35): ");
    interest1 = keyboard.nextFloat();
    System.out.print("두 번째 통장의 이자를 입력 (예: 890.76): ");
    interest2 = keyboard.nextFloat();


    total = (int) (interest1 + interest2);


    tax = (int) (total * 10.0 / 100);

    System.out.printf("총 이자(소수점 이하 버림): %,d 원\n", total);
    System.out.printf("소득세 10%% 공제 : %,d 원\n", tax);
    System.out.printf("순수 이자 : %,d 원\n", total - tax);

    double x = 0.1;
    double sum = x + x + x + x + x + x + x + x + x + x;

    System.out.printf("x = %f, sum = %f\n", x, sum);
    System.out.println(sum);
}