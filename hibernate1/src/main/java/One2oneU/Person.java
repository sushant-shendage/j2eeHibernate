package One2oneU;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
private int    personId    ;	
private String personName  ;
private String personGender;
private String personCity  ;
@OneToOne
private Adhar a;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getPersonGender() {
	return personGender;
}
public void setPersonGender(String personGender) {
	this.personGender = personGender;
}
public String getPersonCity() {
	return personCity;
}
public void setPersonCity(String personCity) {
	this.personCity = personCity;
}
public Adhar getA() {
	return a;
}
public void setA(Adhar a) {
	this.a = a;
}




}
