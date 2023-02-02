package HelloWrld;

public class PersonAge {
	String firstName;
	String lastName;
	int age;
	
	/**
	 * fName -- First Name
	 * lName -- Last Name
	 * age -- Age of Person In Years
	 */
	public PersonAge(String fName, String lName, int age) {
		super();
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return firstName;
	}

	/**
	 * fName the fName to set
	 */
	public void setfName(String fName) {
		this.firstName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lastName;
	}

	/**
	 *  lName the lName to set
	 */
	public void setlName(String lName) {
		this.lastName = lName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 *  age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fName=" + firstName + ", lName=" + lastName + ", age=" + age + "]";
	}
	
	public PersonAge makePerson(PersonAge that) throws UnderAgeException {
		if(age <  18 || that.age < 18) {
			throw new UnderAgeException();
		}
		else {
			PersonAge child = new PersonAge(this.firstName, that.lastName, 0);
			return child;
		}
	}
	public static void main(String[] args) {
		PersonAge p = new PersonAge("Romeo", "Moe", 15);
		System.out.println(p.toString());
	}
	
}
