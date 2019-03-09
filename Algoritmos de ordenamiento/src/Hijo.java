
public class Hijo extends LaMadre {

	public int age =20;
	public double healty_stat=32.5;

	//algo que no quiero que lo vean 
	private int salary=0;
	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean isdead(String disease) {

		return false;
	}

	@Override
	public boolean isdead(char phase_code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isdead() {

		return  age < limit_age  ? false:true;
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		Hijo pepito=new Hijo();
		pepito.isdead();

		Disease dis=new Disease();
		System.out.println(dis.contagius(pepito));
	}
}
