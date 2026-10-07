//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    float dollar;
    int money;
    float exchange;

    System.out.print("달러에 대한 원화 환율을 입력 : ");
    dollar = keyboard.nextFloat();
    System.out.print("원화 금액을 입력 : ");
    money = keyboard.nextInt();
    exchange = money / dollar;

    System.out.printf("원화(%s) %,d원은 %,.2f 달러(%s)입니다.",
            "\u20a9"
            , money, exchange,
            "\u0024");
}