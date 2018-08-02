
package fileIO.demo;

/**
 * @author Michelle Lam
 *
 */
public class Person {
	private String name;
	private int age;

	/**
	 * @param name
	 * @param age
	 * 
	 *            constructor from fields(aka variables)
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getters and setters created here
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}

}
