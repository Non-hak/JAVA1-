//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("구매 금액 입력: ");
    int amount = keyboard.nextInt();

    System.out.print("멤버십 회원인가요? (true/false): ");
    boolean isMember = keyboard.nextBoolean();

    if (amount < 0) {
        System.out.println("오류: 구매 금액은 음수일 수 없습니다.");
    } else if (amount >= 50000 ||
            (isMember && amount >= 30000)) {
        System.out.println("무료배송 가능합니다.");
    } else {
        System.out.println("배송비가 발생합니다.");
    }
}