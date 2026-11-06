//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int start = 1;
    final int end = 100;
    int total = 0;

    for (int i = start; true; i++) {
        if (i % 3 == 0 && i % 5 != 0)
            continue;
        total += i;
        if (i == end)
            break;
    }
    System.out.printf("%d + %d + .... + %d + %d = %,d \n", start, start + 1, end - 1, end, total);
}