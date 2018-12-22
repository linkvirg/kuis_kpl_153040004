package unpas.ac.id.Kuis_153040004;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	public void test1() {
		A a = new A();
		assertEquals(0, a.perkalian(0, 5));
	}
	
	public void test2() {
		A a = new A();
		assertEquals(2, a.perkalian(1, 2));
	}
}
