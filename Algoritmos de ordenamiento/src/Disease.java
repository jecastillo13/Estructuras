
public class Disease {
	public Disease() {}
	public boolean contagius(LaMadre person) {
		//desencapsular 
		double factor=person.getHealth()* (person.getAge()  *0.001);

		return factor < 0.5 ? false: true;
	}
}
