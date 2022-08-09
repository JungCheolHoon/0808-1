
public class Output {
	private Employee[] emp;
	private int a;

	public Output(Employee[] emp, int a) {
		this.emp = emp;
		this.a = a;
	}

	public void output() {
		System.out.println("사원번호   사원이름   부서명    기본급    호급수당    가족수당    야간수당   총금액    실수령액");
		for (int i = 0; i < a; i++) {
			System.out.println(emp[i]);
		}
	}
}
