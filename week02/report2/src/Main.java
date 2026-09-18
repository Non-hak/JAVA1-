//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("원의 반지름을 입력하시오: ");
    double radius = keyboard.nextDouble();

    //정사각형의 한 변의 길이는 반지름의 2배이다.
    double side = radius * 2;

    //면적 계산
    double boxArea = side * side; //정사각형 면적
    double circleArea = radius * radius * 3.14; //원의 면적
    double redArea = boxArea - circleArea;

    //출력
    System.out.println("정사각형의 면적: " + boxArea);
    System.out.println("원의 면적: " + circleArea);
    System.out.println("빨간색 영역의 면적: " + redArea);


}