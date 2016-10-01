/**
 * This is the parent class, also called the contact class.
 * @author Kamalpreet Singh
 *
 */
public abstract class Contact {
private String name;
private int age;

public Contact(String name, int age){
	this.name=name;
	this.age=age;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public abstract void validate();
/**
 * Setting up toString method for parent class and formatting them.
 */
public String toString(){
	return name+" ("+age+"), ";
}

}
