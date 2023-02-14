
public interface Db {
	public default void load() {
		System.out.println("Load");
	}
	public void connect();
	public static void con() {
		System.out.println("con");
	}

}
