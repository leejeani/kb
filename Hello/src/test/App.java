package test;

public class App {

	public static void main(String[] args) {
		Dao<String, Cust> dao = new OracleDao();
		Cust cust = null;
		try {
			Cust c = new Cust("id06", "pwd06", "�̸���", 34);
			int result = dao.insert(c);
			System.out.println(result);
			
			cust = dao.select("id01");
			System.out.println(cust);
		} catch (Exception e) {
			System.out.println("���� �߻�");
		}
	}

}
