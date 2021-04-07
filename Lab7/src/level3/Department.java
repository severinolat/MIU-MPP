package level3;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private String location;
	private List<Position> positions;
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}

	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		positions = new ArrayList<Position>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		for(Position p : positions) {
			System.out.println(p.getTitle()+" : "+p.getDescription());
			p.print();
		}
	}
	
	public void addPosition(Position p) {
		positions.add(p);
	}
	
	@Override
	public boolean equals(Object department) {
		if(department == null) return false;
		if(!(department instanceof Department)) return false;
		Department d = (Department) department;
		return
		  name.equals(d.name) &&
		  location.equals(d.location) &&
		  positions.equals(d.positions);
	}
	
	public String toString() {
		return "Name "+name+" Location "+location+ " Positions "+ positions;
	}
}
