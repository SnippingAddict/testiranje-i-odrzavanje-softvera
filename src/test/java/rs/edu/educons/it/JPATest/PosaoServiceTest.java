package rs.edu.educons.it.JPATest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import rs.edu.educons.it.JPATest.entity.Posao;
import rs.edu.educons.it.JPATest.service.PosaoService;;

public class PosaoServiceTest {

	int rez;
	PosaoService posaoService = new PosaoService();

	@Before
	public void beforeTest() {
		System.out.println("Before");
		rez = 0;
	}

	@Test
	public void brutoTest() {
		System.out.println("Bruto test");

		int rez = (int) posaoService.calculatorBruto(0.1, 0.1, 99, 50);

		assertEquals(rez, 3960);
		assertNotEquals(rez, 3961);
		assertNotEquals(rez, 3959);
		assertNotEquals(rez, 0);

		int rez2 = (int) posaoService.calculatorBruto(0.13, 0.1, 200, 150);

		assertEquals(rez2, 23100);
		assertNotEquals(rez2, 23101);
		assertNotEquals(rez2, 23099);
		assertNotEquals(rez2, 0);

		int rez3 = (int) posaoService.calculatorBruto(0.13, 0.1, 200, 78);

		assertEquals(rez3, 12012);
		assertNotEquals(rez3, 12013);
		assertNotEquals(rez3, 12011);
		assertNotEquals(rez3, 0);
	}

	@Test
	public void bonusTest() {
		System.out.println("Bonus test");

		int rez = (int) posaoService.calculatorBonus(10);

		assertEquals(rez, 0);
		assertNotEquals(rez, 12500);

		int rez2 = (int) posaoService.calculatorBonus(150);

		assertEquals(rez2, 12500);
		assertNotEquals(rez2, 12501);
		assertNotEquals(rez2, 12499);
		
		int rez3 = (int) posaoService.calculatorBonus(200);
		
		assertEquals(rez3, 13000);
		assertNotEquals(rez3, 13001);
		assertNotEquals(rez3, 12999);
		
	}

}
