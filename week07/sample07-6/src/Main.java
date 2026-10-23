import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int com = random.nextInt(3);
        int user;

        System.out.println("=========== 가위 바위 보 게임 ============");
        System.out.print("\t가위(0), 바위(1), 보(2) 입력 : ");
        user = keyboard.nextInt();

        switch (user) {
            case 0:
                System.out.print("사용자 : 가위, ");

                switch (com) {
                    case 0:
                        System.out.println("컴퓨터 : 가위");
                        System.out.println("비겼습니다.");
                        break;
                    case 1:
                        System.out.println("컴퓨터 : 바위");
                        System.out.println("컴퓨터 Win!!");
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 보");
                        System.out.println("사용자 Win!!");
                        break;
                }
                break;

            case 1:
                System.out.print("사용자 : 바위, ");

                switch (com) {
                    case 0:
                        System.out.println("컴퓨터 : 가위");
                        System.out.println("사용자 Win!!");
                        break;
                    case 1:
                        System.out.println("컴퓨터 : 바위");
                        System.out.println("비겼습니다.");
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 보");
                        System.out.println("컴퓨터 Win!!");
                        break;
                }
                break;

            case 2:
                System.out.print("사용자 : 보, ");

                switch (com) {
                    case 0:
                        System.out.println("컴퓨터 : 가위");
                        System.out.println("컴퓨터 Win!!");
                        break;
                    case 1:
                        System.out.println("컴퓨터 : 바위");
                        System.out.println("사용자 Win!!");
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 보");
                        System.out.println("비겼습니다.");
                        break;
                }
                break;

            default:
                System.out.println("잘못된 숫자를 입력하였습니다.");
        }

        keyboard.close();
    }
}