package fr.unilim.iut.kataparrot;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParrotTest {

	@Test
	public void getSpeedOfEuropeanParrot() {
		Parrot parrot = new EuropeanParrot();
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_One_Coconut() {
		Parrot parrot = new AfricanParrot(1);
		assertEquals(3.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		Parrot parrot = new AfricanParrot(2);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_No_Coconuts() {
		Parrot parrot = new AfricanParrot(0);
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNailedParrot() {
		Parrot parrot = new NailedParrot(); //new NorwegianParrot(0, true);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianParrot() {
		Parrot parrot = new NorwegianParrot(1.5); //new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 1.5, false);
		assertEquals(18.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianParrot_high_voltage() {
		Parrot parrot = new NorwegianParrot(4); //new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 4, false);
		assertEquals(24.0, parrot.getSpeed(), 0.0);
	}
}
