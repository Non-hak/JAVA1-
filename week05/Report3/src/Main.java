//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int totalSeconds = 54321;

    int hour = totalSeconds / 3600;
    int remain = totalSeconds % 3600;

    int minute = remain / 60;
    int second = remain % 60;

    System.out.println(totalSeconds + "초 = " + hour + "시간 " + minute + "분 " + second + "초");
}