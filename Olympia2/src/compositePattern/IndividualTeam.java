package compositePattern;

public class IndividualTeam implements Team{

	private String name;
	private Integer goldMedals;
	private Integer athletes;
	
	public IndividualTeam(String name, int athletes, int goldMedals) {
		this.name = name;
		this.athletes = athletes;
		this.goldMedals = goldMedals;
	}

	@Override
	public void getTeamName() {
		System.out.println(name);
	}

	@Override
	public void getNumberOfGoldMedals() {
		System.out.println("Team: "+ this.name + ", Number of Gold Medals: "+ this.goldMedals);	
	}

	@Override
	public void getNumberOfAtlethes() {
		System.out.println("Team: "+ this.name + ", Number of Athletes: "+ this.athletes);
	}

}
