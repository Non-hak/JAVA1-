//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("당신의 JAVA 점수 입력: ");
    int score = keyboard.nextInt();

    if (score < 0 || score > 100) {
        System.out.println("점수를 0~100 사이로 입력하세요.");
    }

    int level;

    if (score >= 95) {
        level = 0;
    } else if (score >= 90) {
        level = 1;
    } else if (score >= 85) {
        level = 2;
    } else if (score >= 80) {
        level = 3;
    } else if (score >= 75) {
        level = 4;
    } else if (score >= 70) {
        level = 5;
    } else if (score >= 65) {
        level = 6;
    } else if (score >= 60) {
        level = 7;
    } else {
        level = 8;
    }

    String grade;

    if (level == 8) {
        grade = "F";
    } else {
        char letter = (char) ('A' + level / 2);
        char suffix = (level % 2 == 0) ? '+' : '0';

        grade = "" + letter + suffix;
    }

    System.out.println("입력 점수: " + score);
    System.out.println("학점: " + grade);

}
