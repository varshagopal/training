
public class Person implements Comparable<Person> {
	private String name;
	private  int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.getName()); //comparator to compare two elements in Sorted Person class
	}
	
	@Override
	public String toString() {
		return "Person [Name:"+name+", Age:"+age+"]";
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	
}
