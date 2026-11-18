//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int[] students1 = new int[] {41,43,45,42,44,39}; //1학년
    int[] students2 = new int[] {41,43,45,42,44,39}; //2학년
    int[] students3 = new int[] {41,43,45,42,44,39}; //3학년

    int[][] students = new int[][]{students1, students2, students3};

    int[][] hisghschoolStudent = { //{1반, 2반, 3반, 4반, 5반, 6반, 합계}
            {41, 43, 45, 42, 44, 39, 0}, //1학년
            {41, 43, 45, 42, 44, 39, 0}, //2학년
            {41, 43, 45, 42, 44, 39, 0} //3학년
    };
    int[] total = new int[hisghschoolStudent.length]; //결과
    int sum = 0;


    //학년별로 학생 수 더하기
    for(int i = 0; i < hisghschoolStudent.length; i++) {
        for(int j = 0; j <hisghschoolStudent[i].length; j++) {
            hisghschoolStudent[j][6] += hisghschoolStudent[i][6];
            total[i] += hisghschoolStudent[i][6];
        }
    }
    for(int i = 0; i < hisghschoolStudent.length; i++)
        sum += total[i];
    for(int i = 0; i < total.length; i++)
        sum += total[i];

    System.out.println("***********************************************");
    System.out.println("   1반      2반     3반    4반    5반    6반   합계");
    System.out.println("***********************************************");
    for(int i = 0; i < hisghschoolStudent.length; i++) {
        System.out.printf("%d학년 %3d %3d %3d %3d %3d %3d %3d\n", i+ 1, hisghschoolStudent[i][0],
                hisghschoolStudent[i][1], hisghschoolStudent[i][2],
                hisghschoolStudent[i][3], hisghschoolStudent[i][4],
                hisghschoolStudent[i][5], hisghschoolStudent[i][6]);
    }
    System.out.printf("\t\t\t\t\t\t 학교 정원 : %,d 명\n", sum);
}