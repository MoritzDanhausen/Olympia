package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class OlympicTeam implements Team{
	
	private String name;
	private Integer goldMedals;
	private Integer athletes;
	
	private List <Team> Teams = new ArrayList<>();

	public OlympicTeam(String name) {
		this.name = name;
	}
	
	public void add(Team team) {
		Teams.add(team);	
	}
	
	public void remove(Team team) {
		Teams.remove(team);	
	}
	
	public void getTeams() {
		Teams.forEach(Team ->{
			System.out.println(name);
		});
	}

	@Override
	public void getTeamName() {
		for (Team t : Teams) {
			t.getTeamName();
		}
	}

	@Override
	public void getNumberOfGoldMedals() {
		for (Team t : Teams) {
			t.getNumberOfGoldMedals();
		}
	}

	@Override
	public void getNumberOfAtlethes() {
		for (Team t : Teams) {
			t.getNumberOfAtlethes();
		}
	}

}
