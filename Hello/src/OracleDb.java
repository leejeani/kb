
public class OracleDb implements Db{

	
	@Override
	public void connect() {
		Db.con();
		load();
		System.out.println("Oracle Connect ...");
	}

}
