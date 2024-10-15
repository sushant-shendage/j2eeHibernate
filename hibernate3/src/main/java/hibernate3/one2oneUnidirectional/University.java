package hibernate3.one2oneUnidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {
@Id	
private int id;
private String name;
private int rank;


public University() {
	super();
	// TODO Auto-generated constructor stub
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getRank() {
	return rank;
}


public void setRank(int rank) {
	this.rank = rank;
}




}
