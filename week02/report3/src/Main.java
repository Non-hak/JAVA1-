import java.sql.SQLOutput;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("당신의 이름은?: ");
    String name = keyboard.nextLine();

    //가족 수 입력 받기
    System.out.print(name + "님의 가족은 몇 명 입니까?:");
    int familyCount = keyboard.nextInt();

    //거주지 입력 받기
    System.out.print(name + "님의 가족은 어디에서 살지요?: ");
    String location = keyboard.next();

    //출력
    System.out.println(name + "님의 가족은 " + familyCount + "명 입니다.");
    System.out.println(name + "님의 가족은 " + location + "에서 살고 있습니다.");
}