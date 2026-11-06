//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int start = 1;
    final int end = 100;
    int total = 0;
    int first, last;
    String result;
    char answer;
    for (int i = start; i <= end; i++) {
        total += i;
    }
    System.out.printf("%d + %d + .... + %d + %d = %,d \n", start, start + 1, end - 1, end, total);


    //*****************************
    while(true) {
        total = 0;
        while (true) {
            System.out.println("어디부터 시작할까요?: ");
            first = keyboard.nextInt();
            System.out.println("어디까지 더할까요?: ");
            last = keyboard.nextInt();
            if (first <= last) {
                break;
            } else {
                System.out.printf("ERROR: 시작 값(%d)이 종료값(%d) 보다 작거나 같아야 함", first, last);
                System.in.read();
            }
        }

        for (int i = first; i <= last; i++) {
            total += i;
        }

        if (last - first >= 4) {
            result = String.format("%d + %d + .... + %d + %d = %,d \n", first, first + 1, last - 1, last, total);
        } else {
            if (last == first)
                result = String.format("%d = %d\n", first, total);
            else if (last - first == 1) {
                System.out.printf("%d + %d = %d\n", first, last, total);
            } else {
                System.out.printf("%d + %d + %d + %d = %d\n", first, first + 1, last - 1, last, total);
            }
        }
        System.out.println(result);
        System.out.println("계속할까요?: (Yes/No)");
        keyboard.nextLine();
        answer = keyboard.nextLine().charAt(0);
        if (answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n')
            break;
        else {
            System.out.print("ERROR : 입력오류 ");
            System.in.read();
        }
    }
    if (answer == 'N' || answer == 'n')
        break;
    else {

    }
}