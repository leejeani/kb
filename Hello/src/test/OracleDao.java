package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class OracleDao implements Dao<String, Cust> {

	public OracleDao() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection con = null;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "customer", "111111");
		return con;
	}

	@Override
	public int insert(Cust v) throws Exception {
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement("INSERT INTO cust VALUES (?,?,?,?)");
		try (conn; pstmt) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			//throw e;
		}
		return result;
	}

	@Override
	public int delete(String k) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Cust v) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM cust WHERE id = ?");
		try (conn; ps) {
			ps.setString(1, k);

			try (ResultSet rs = ps.executeQuery()) {
				// 결과 레코드가 끝날때까지 반복
				rs.next();
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				cust = new Cust(id, name, pwd, age);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cust;

	}

	@Override
	public List<Cust> select() throws Exception {
		Cust cust = null;
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM cust WHERE id = ?");
		try (conn; ps) {

			try (ResultSet rs = ps.executeQuery()) {
				// 결과 레코드가 끝날때까지 반복
				while (rs.next()) {
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String job = rs.getString("job");
					String phone = rs.getString("phone");

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
