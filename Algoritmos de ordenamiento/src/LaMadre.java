import java.util.Random;

public abstract class LaMadre{
	
	public  final int limit_age=100;
	
	public abstract void walk();

	public abstract boolean isdead();

	public abstract boolean isdead(String disease);
	
	public abstract boolean isdead(char phase_code);
	
	public abstract int getHealth();
	
	public abstract int getAge();
}