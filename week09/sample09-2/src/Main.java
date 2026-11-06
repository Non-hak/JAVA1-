//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int line = 5;
    final int star = 25;
    System.out.println("******************************************");
    System.out.println("******************************************");
    System.out.println("******************************************");
    System.out.println("******************************************");
    System.out.println("******************************************");
    System.out.println();

    //반복문
    for (int i = 1; i <= line; i++)
        System.out.println("******************************************");

    for (int i = 1; i <= line; i++) {
        for (int j = 1; j <= star; j++)
            System.out.println("*");
    }
    System.out.println();


    int i = 1;
    while (i <= line) {
        int j = 1;
        for (j <= star) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;

    }
    System.out.println();

    // ************************************************
    i = 1;
    do {
        int j= 1;
        do{
            System.out.print("*");
            j++;
        }
    } while (j <= star);
    System.out.println();
    i++;
} while (i <= line);
