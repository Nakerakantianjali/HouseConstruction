package HouseConstruction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseConstructionTest {

	@Test
	void test() {
		HouseConstruction houseConstruction=new HouseConstruction();
		assertEquals(1200*1200, houseConstruction.estimatecost(1200, "standard"));
	}

}
