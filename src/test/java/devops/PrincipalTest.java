package devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrincipalTest {

	@Test
	public void testAlwaysTrue() {
		System.out.println("Test in pipeline");
		assertTrue(true);
	}

}
