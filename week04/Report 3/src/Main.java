

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("지구에서의 몸무게를 입력하세요 (kg): ");
    double earthWeight = scanner.nextDouble();


    double moonWeight = earthWeight * 0.165;

    System.out.println("달에서의 몸무게: " + moonWeight + " kg");

}