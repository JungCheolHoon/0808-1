
public class Employee {
	private String num, name, group;
	private int basic, night, family;
	private int ba, ni , fa, ho, tot, real;
	private double tax;

	public Employee(String num, String name , int basic, int night, int family) {
		this.num = num;
		this.basic = basic;
		this.night = night;
		this.family = family;
		this.name = name;
	}

	public int getBa() {
		return ba;
	}

	public void setBa(int ba) {
		this.ba = ba;
	}

	public String getNum() {
		return num;
	}

	public int getFa() {
		return fa;
	}

	public void setFa(int fa) {
		this.fa = fa;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getNight() {
		return night;
	}

	public void setNight(int night) {
		this.night = night;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getNi() {
		return ni;
	}

	public void setNi(int ni) {
		this.ni = ni;
	}

	public double getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getHo() {
		return ho;
	}

	public void setHo(int ho) {
		this.ho = ho;
	}

	@Override
	public String toString() {
		return String.format("%s         %s     %s            %d                %d           %d           %d           %d        %d", num, name,
				group, basic, ho, fa, ni, tot, real);
	}

	
	

}
