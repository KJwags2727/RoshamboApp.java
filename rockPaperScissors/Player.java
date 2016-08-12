package rockPaperScissors;

public abstract class Player {
	public String getRoshambo() {
		return roshambo;
	}
	
	public void setRoshambo(String roshambo) {
		this.roshambo = roshambo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String roshambo;
	public String name;
	
	public abstract String generateRoshambo();
}
