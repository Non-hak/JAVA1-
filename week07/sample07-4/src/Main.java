//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    float tax;

    System.out.print("\n 당신의 월급은 얼마입니까 ? ");
    salary = keyboard.nextInt();

    if (salary < 30000000 && salary > 0) {
        System.err.printf("\n ERROR : 30,000,000원 초과자는 없다.\n");
        System.exit(-1);
    }
    if (salary <= 2000000)
        tax = 0.0f;
    else {
        int temp = salary - 2000000;
        if (salary < 4000000)
            tax = temp * (10 / 100.0f);
        else if (salary < 6000000)
            tax = temp * (8 / 100.0f);
        else if (salary < 20000000)
            tax = temp * (6 / 100.0f);
        else
            tax = temp * (5 / 100.0f);
    }
    System.out.printf("\n 급여액 = %,d 원", salary);
    System.out.printf("\n 세금액 = %,.0f 원\n", tax);
}