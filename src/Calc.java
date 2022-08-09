
public class Calc {
	private Employee[] emp;
	private int a;

	public Calc(Employee[] emp, int a) {
		this.emp = emp;
		this.a = a;
	}

	public void calc() {
		for (int i = 0; i < a; i++) {
			switch (emp[i].getNum().charAt(1)) {
			case '1':
				emp[i].setHo(900000);
				break;
			case '2':
				emp[i].setHo(400000);

				break;
			case '3':
				emp[i].setHo(600000);

				break;
			case '4':
				emp[i].setHo(800000);

				break;
			case '5':
				emp[i].setHo(300000);

				break;
			case '6':
				emp[i].setHo(800000);

				break;
			case '7':
				emp[i].setHo(800000);

				break;
			}
			switch (emp[i].getNight()) {
			case 1:
				emp[i].setNi(1500);

				break;
			case 2:
				emp[i].setNi(2500);
				break;
			case 3:
				emp[i].setNi(3500);
				break;
			case 4:
				emp[i].setNi(4500);
				break;
			}

			switch (emp[i].getNum().charAt(0)) {
			case 'A':
				emp[i].setGroup("영업부");

				break;
			case 'B':
				emp[i].setGroup("업무부");
				break;
			case 'C':
				emp[i].setGroup("홍보부");
				break;
			case 'D':
				emp[i].setGroup("인사부");
				break;
			case 'E':
				emp[i].setGroup("경리부");
				break;
			case 'F':
				emp[i].setGroup("판촉부");
				break;
			case 'G':
				emp[i].setGroup("총무부");
				break;
			}

			switch (emp[i].getBasic()) {
			case 1:
				emp[i].setBa(15000);

				break;
			case 2:
				emp[i].setBa(25000);
				break;
			case 3:
				emp[i].setBa(35000);
				break;
			case 4:
				emp[i].setBa(45000);
				break;
			}
			emp[i].setFa(7000 * emp[i].getFamily());

			emp[i].setTax(emp[i].getHo() * 0.1);
			emp[i].setTot(emp[i].getHo() + emp[i].getBa() + emp[i].getNi() + emp[i].getFa());
			emp[i].setReal((int) ((double) emp[i].getTot() - emp[i].getTax()));
		}
	}

}
