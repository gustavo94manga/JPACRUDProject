package com.skilldistillery.onepiececards.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OnePieceCardTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private OnePieceCard opc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAOnePieceCards");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		opc = em.find(OnePieceCard.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		opc = null;
	}

	@Test
	void test_OnePieceCards_entity_mapping() {
		assertNotNull(opc);
		assertEquals("Zoro", opc.getName());
		assertEquals("Roronoa", opc.getLastName());
		assertEquals("Leader", opc.getCardType());
	}
//	@Test
//	void test_OnePieceCards_Entity_mapping() {
//		assertNotNull(opc);
//		assertEquals("Trafalgar", opc.getName());
//		assertEquals("Law", opc.getLastName());
//		assertNull(opc.getDon());
//		assertEquals("Leader", opc.getCardType());
//	}
//	@Test
//	void test_OnePieceCards_Entity_Mapping() {
//		assertNotNull(opc);
//		assertEquals("Zoro", opc.getName());
//		assertNull(opc.getLastName());
//		assertNull(opc.getDon());
//		assertEquals("Leader", opc.getCardType());
//	}

}
