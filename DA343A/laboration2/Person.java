package laboration2;

public class Person implements Comparable<Person>{
	private String id;
	private String firstName;
	private String lastName;

	public Person( String id, String firstName, String lastName ) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean equals(Object obj) {
		return (obj instanceof Person) && (this.getId().equals(((Person) obj).getId()));
	}

	public String toString() {
		return id + " " + firstName + " " + lastName;
	}

	@Override
	public int compareTo(Person p) {
		
		return this.getId().compareTo(p.getId());
	}    
}
