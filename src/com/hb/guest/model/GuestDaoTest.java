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
		assertNotNull(dto);//널이면 fail
		assertEquals(1111, dto.getSabun());//예상한값, 실제 값 비교
		assertEquals("aaaa", dto.getName());//예상한값, 실제 값 비교
	}
	@Test
	public void testSelectAll() throws Exception {
//		fail("Not yet implemented");

		GuestDao dao = new GuestDao();
		ArrayList<GuestDto> list = dao.selectAll();
		assertNotNull(list);//널이면 fail
//		assertEquals(4, list.size());
		assertTrue(list.size()>0);//false면 fail
		assertFalse(false);//true면 fail
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
