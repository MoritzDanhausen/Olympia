package compositePattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OlympicTeam olympia = new OlympicTeam("Olympia");
		
		OlympicTeam asia = new OlympicTeam("Asia");
		OlympicTeam africa = new OlympicTeam("Africa");
		OlympicTeam europe = new OlympicTeam("Europe");
		OlympicTeam south_america = new OlympicTeam("South-America");

		OlympicTeam china = new OlympicTeam("China");
		OlympicTeam afghanistan = new OlympicTeam("Afghanistan");
		OlympicTeam germany = new OlympicTeam("Germany");
		OlympicTeam italy = new OlympicTeam("Italy");

		OlympicTeam chinaWomen = new OlympicTeam("China-Women");
		OlympicTeam chinaMen = new OlympicTeam("China-Men");
		OlympicTeam germanyWomen = new OlympicTeam("Germany-Women");
		OlympicTeam germanyMen = new OlympicTeam("Germany-Men");
		OlympicTeam italyWomen = new OlympicTeam("Italy-Women");
		OlympicTeam italyMen = new OlympicTeam("Italy-Men");
		
		IndividualTeam chinaWomenTeakwondo = new IndividualTeam("Women's Teakwondo",4,2);
		IndividualTeam chinaWomenWaterpolo = new IndividualTeam("Women's Waterpolo",12,1);
		IndividualTeam chinaWomenArtisticGymnastics = new IndividualTeam("Women's Artistic Gymnastics",7,0);
		
		IndividualTeam chinaMenShooting = new IndividualTeam("Men's Shooting",2,1);

		IndividualTeam germanyWomenCycling = new IndividualTeam("Women's Cycling",3,2);
		IndividualTeam germanyWomenTennis = new IndividualTeam("Women's Tennis",2,0);

		IndividualTeam germanyMenTableTennis = new IndividualTeam("Men's Table Tennis",2,0);
		IndividualTeam germanyMenFootball = new IndividualTeam("Men's Football",23,1);

		IndividualTeam italyWomenAlpineSky = new IndividualTeam("Women's Alpine Sky",2,0);
		
		IndividualTeam italyMenFootball = new IndividualTeam("Men's Football",23,0);
		IndividualTeam italyMenSwimmingTeam = new IndividualTeam("Men's Swimming Team",23,1);
		
		olympia.add(asia);
		asia.add(china);
		asia.add(afghanistan);
		china.add(chinaWomen);
		china.add(chinaMen);
		
		chinaWomen.add(chinaWomenTeakwondo);
		chinaWomen.add(chinaWomenWaterpolo);
		chinaWomen.add(chinaWomenArtisticGymnastics);
		
		chinaMen.add(chinaMenShooting);

		olympia.add(africa);
		
		olympia.add(europe);
		europe.add(germany);
		europe.add(italy);
		
		germany.add(germanyWomen);
		germany.add(germanyMen);
	
		germanyWomen.add(germanyWomenCycling);
		germanyWomen.add(germanyWomenTennis);
		
		germanyMen.add(germanyMenTableTennis);
		germanyMen.add(germanyMenFootball);

		italy.add(italyWomen);
		italy.add(italyMen);
		
		italyWomen.add(italyWomenAlpineSky);
		
		italyMen.add(italyMenFootball);
		italyMen.add(italyMenSwimmingTeam);
		
		olympia.add(south_america);
		
		//Germany-Men Name and Athletes	
		germanyMen.getTeamName();
		germanyMen.getNumberOfAtlethes();
		System.out.println();	
		
		//Germany Teams and Gold Medals	
		germany.getTeamName();
		germany.getNumberOfGoldMedals();
		System.out.println();
		
		//Asia Name and Gold Medals	
		asia.getTeamName();
		asia.getNumberOfGoldMedals();
		System.out.println();
		
		//Olympia Names and Athletes
		olympia.getTeamName();
		olympia.getNumberOfAtlethes();
		System.out.println();

	}

}
