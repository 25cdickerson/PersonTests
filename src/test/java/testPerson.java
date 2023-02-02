import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import HelloWrld.PersonAge;
import HelloWrld.UnderAgeException;

class testPerson {

	public PersonAge r;
	public PersonAge j;
	public PersonAge c;
	public PersonAge m;
	
	@BeforeEach
	void setUp() throws Exception {
		r = new PersonAge("Romeo", "Moe", 15);
		j = new PersonAge("Juliet", "Buck", 14);
		c = new PersonAge("Count", "Duku", 54);
		m = new PersonAge("Mrs", "Duku", 54);
	}
	
	@Test
	void testToString() {
		assertEquals("Person [fName=Romeo, lName=Moe, age=15]", r.toString());
	}
	
	@Test
	void tstPerson() {
		assertThrows(UnderAgeException.class, ()->{r.makePerson(j);});
		assertThrows(UnderAgeException.class, ()->{c.makePerson(j);});
		assertThrows(UnderAgeException.class, ()->{m.makePerson(r);});
		
		try {
			PersonAge child = c.makePerson(m);
			assertEquals(c.getfName(), child.getfName());
			assertEquals(m.getlName(), child.getlName());
			assertEquals(0, child.getAge());
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("threw exception");
		}
		//Person child = r.makePerson(j);
		
		
	}
}
