//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    final int BASE = 60;
    final int DAY = 24;
    int time;
    int day, hour, minute, sec;

    System.out.print("초단위 시간을 입력하세요 : ");
    time = keyboard.nextInt();

    sec = time;
    minute = sec / BASE;
    sec %= BASE;
    hour = minute / BASE;
    minute %= BASE;
    day = hour / DAY;
    hour %= DAY;

    System.out.printf("%,d seconds = %,d day %d hour %d minute %d sec\n", time, day, hour, minute, sec);
}