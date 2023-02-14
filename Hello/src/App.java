
public class App {

	public static void main(String[] args) {
		OracleDb o = new OracleDb();

		o.connect();
		
		Db db = new Db() {
			
			@Override
			public void connect() {
				System.out.println("Con");
			}
		};
		
		db.connect();
	}

}
