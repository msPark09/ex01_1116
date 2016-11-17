package com.hb.guest.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GuestDaoTest {


	@Test
	public void testSelectOne() throws Exception {
//		fail("Not yet implemented");
		int sabun =1111;
		GuestDao dao = new GuestDao();
		GuestDto dto = dao.selectOne(sabun);
		assertNotNull(dto);//���̸� fail
		assertEquals(1111, dto.getSabun());//�����Ѱ�, ���� �� ��
		assertEquals("aaaa", dto.getName());//�����Ѱ�, ���� �� ��
	}
	@Test
	public void testSelectAll() throws Exception {
//		fail("Not yet implemented");

		GuestDao dao = new GuestDao();
		ArrayList<GuestDto> list = dao.selectAll();
		assertNotNull(list);//���̸� fail
//		assertEquals(4, list.size());
		assertTrue(list.size()>0);//false�� fail
		assertFalse(false);//true�� fail
	}

	@Test
	public void testInsertOne() throws Exception {
//		fail("Not yet implemented");

		GuestDao dao = new GuestDao();
		GuestDto dto = new GuestDto();
		dto.setSabun(0);
		dto.setName("test");
		dto.setPay(0);
		dao.insertOne(dto);
		dao = new GuestDao();
		assertEquals(dto.getName(), dao.selectOne(0).getName());
	}
}
