package com.hb.guest.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class GuestDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public GuestDao() {
		try {
			Class.forName("org.h2.Driver");
			conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test"
					, "sa", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// public int selectAll() {
	public ArrayList selectAll() throws Exception {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		String sql = "SELECT * FROM GUEST";
		try {
			System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
//				HashMap map = new HashMap();
//				map.put("sabun", rs.getInt("sabun"));
//				map.put("name", rs.getString("name"));
//				map.put("nalja", rs.getDate("nalja"));
//				map.put("pay", rs.getInt("pay"));
//				list.add(map);
				GuestDto dto = new GuestDto();
				dto.setSabun(rs.getInt("sabun"));
				dto.setName(rs.getString("name"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setPay(rs.getInt("pay"));
				list.add(dto);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

		// int sabun = 1111;
		// String name ="saram";
		// int pay = 1000;
		// map.put("sabun", sabun);
		// map.put("name", name);
		// map.put("nalja", new Date());
		// map.put("pay", pay);

		// list.add(map);

		// list.add(101);
		// list.add(102);
		// list.add(103);
		return list;
	}

}
