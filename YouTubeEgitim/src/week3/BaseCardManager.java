package week3;

public abstract class BaseCardManager implements ICreditManager {
	public abstract  void calculate();
	public void save() {
		
		System.out.println("kayıt basarılı");
	}
}
