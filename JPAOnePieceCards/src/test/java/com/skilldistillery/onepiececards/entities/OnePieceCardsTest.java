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

class OnePieceCardsTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private OnePieceCards opc;

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
		opc = em.find(OnePieceCards.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		opc = null;
	}

	@Test
	void test_OnePieceCards_entity_mapping() {
		assertNotNull(opc);
		assertEquals("Luffy", opc.getName());
	}

}
