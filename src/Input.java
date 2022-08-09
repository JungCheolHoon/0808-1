import java.util.Scanner;

public class Input {
	private Employee[] emp;
	private int a;
	private Scanner sc;

	public Input(Employee[] emp, int a) {
		this.emp = emp;
		this.a = a;
		sc = new Scanner(System.in);
	}

	public void input() {
		for (int i = 0; i < a; i++) {
			System.out.print("사원번호를 입력하세요");
			String num = sc.nextLine();
			System.out.print("이름를 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("기본급을 입력하세요 : ");
			int basic = sc.nextInt();
			System.out.print("야간시간을 입력하세요 : ");
			int night = sc.nextInt();
			System.out.print("가족수를 입력하세요 : ");
			int family = sc.nextInt();
			sc.nextLine();
			emp[i] = new Employee(num, name, basic, night, family);
		}
	}
}
