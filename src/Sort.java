
public class Sort {
	private Employee[] emp;
	private int a;

	public Sort(Employee[] emp, int a) {
		this.emp = emp;
		this.a = a;
	}
	public void selectionSort() {
		for (int i = 0; i < a-1; i++) {
			for (int j = 0; j < a-1; j++) {
				if ((int)(this.emp[i].getNum().charAt(0)) < (int)(this.emp[j].getNum().charAt(0))) {
					this.swap(i, j);
				}
				if(emp[i].getNum() == emp[j].getNum()) {
					System.out.println("중복된 사원이 존재합니다.");
				}
			}
		}
	}

	private void swap(int front, int back) {

		Employee temp = this.emp[front];
		this.emp[front] = this.emp[back];
		this.emp[back] = temp;

	}
}