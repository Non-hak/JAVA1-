//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("판매금액을 입력하세요 (원): ");
    int totalAmount = scanner.nextInt();


    long amount = Math.round(totalAmount / 1.1);


    long tax = totalAmount - amount;

    System.out.println("금액 : " + amount + "원");
    System.out.println("세금 : " + tax + "원");
}