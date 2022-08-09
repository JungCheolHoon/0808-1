import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 사원수를 입력하세요 : ");
		int cnt = sc.nextInt();
		Employee [] emp = new Employee[cnt];
		Input input = new Input(emp,cnt);
		input.input();
		Calc calc = new Calc(emp,cnt);
		calc.calc();
		Sort sort = new Sort(emp,cnt);
		sort.selectionSort();
		Output output = new Output(emp,cnt);
		output.output();
	}
	
}
