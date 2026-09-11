//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in); // in -> keyboard. keyboard는 객체이다.
    String name; // name-> 객체
    int age; //age -> 변수

    System.out.print("당신의 이름은?"); //답을 기다리는 문장은 프롬프트(prompt) 문장이다.
    name = keyboard.nextLine();
    System.out.printf("%s님의 나이는?", name); //prompt 문장
    age = keyboard.nextInt();

    System.out.printf("이름: %s, 나이: %d\n", name, age);
}