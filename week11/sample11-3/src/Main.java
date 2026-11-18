//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int ID = 0;
    final int NAME = 1;
    final int BASE = 0;
    final int SUDANG = 1;
    final int SALRARY = 2;
    final int TAX = 3;
    final int NET = 4;

    String[][] employees = new String[][] {{"1111", "홍길동"},
            {"1111", "홍길동"},{"1111", "홍길동"},{"1111", "홍길동"},
            {"1111", "홍길동"},{"1111", "홍길동"},{"1111", "홍길동"},
            {"1111", "홍길동"},{"1111", "홍길동"},{"1111", "홍길동"}};
    char[] grade = new char[] {'1', '2', '3', '4','5','1','2','3','4','5'};
    int[][] salary = {{0,800000,0,0,0}, {0,800000,0,0,0}, {0,800000,0,0,0},
            {0,800000,0,0,0}, {0,800000,0,0,0}, {0,800000,0,0,0},
            {0,800000,0,0,0}, {0,800000,0,0,0}, {0,800000,0,0,0},
            {0,800000,0,0,0}};
    int[] unit = {0,1650000, 1680000, 1700000, 1720000, 1750000};  //기본급 테이블
int[] taxRate = {}
    for(int i = 0; i < employees.length; i++) {
        salary[i][BASE] = unit[grade[i] - '0'];
    }
    int count = 0;
    while (count < employees.length) {
        System.out.printf("%s 사원의 수당 입력 :", employees[count][NAME]);
        salary[count][SUDANG] = keyboard.nextInt();

        if(salary[count][SUDANG] >= 0 && salary[count][SUDANG] <= 1000000)
            count ++;
        else {
            System.out.print("ERROR : 0 ~ 1,000,000");
            System.in.read();
        }

        for(int i = 0; i < employees.length; i++) {
            salary[i][SALRARY] = salary[i][BASE]
        }
    }

    for(int i = 0; i < employees.length; i++) {
        System.out.printf("%3s %4s %c %,10d %,10d\n",
                employees[i][NAME], employees[i][ID], grade[i],
                salary[i][BASE], salary[i][SUDANG]);
    }
    for(int i = 0; i < employees.length; i++) {
        int temp = salary[i][SALRARY] - (int) salary[i][SALRARY] * 15.0f / 100);
if(temp < taxRate[0]) {
    salary[i][TAX] = (int) (temp * 3.3f / 100);
} else if (temp < taxRate[1]) {
    salary[i][TAX] = (int)
}
    }
}