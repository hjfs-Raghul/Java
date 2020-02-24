package sample;

public class UserEntry {
	public static void main(String args[]) {
		Factory f = new Factory();
		f.CreateObject("Human");
		f.CreateObject("others");
	}

}
