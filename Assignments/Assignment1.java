
public class SportsRules {
	
	int Basketball;
	public  static final int TIME_PERIODS = 4; //Named Constant
	public static final int PLAYERS_FOULS_ALLOWED = 5;
	public static final int POINTS_PER_FREE_THROW = 1;
	
        int Football;
	public static final int POINTS_PER_THOUCHDOWN = 6;
	public static final int POINTS_PER_EXTRA_POINT = 1;
	public static final int POINTS_PER_SAFETY = 2;
	 
	int Soccer;
	public static final int PLAYER_PER_TEAM = 11;
	public static final int TIME_PERIOD = 2;
	public static final int GPALIES_PER_TEAM = 1;
	
	int Cricket;
	public static final int PLAYERS_PER_TEAM = 11;
	public static final int INNINGS = 2;
	
	int Bowling;
	public static final int FRAMES_PRE_GAME = 10;
	public static final int MAX_SCORE = 300;
	public static final int PINS_PER_FRAME = 10;
    
	public static void main(String[] args) {
		
		// constants never change once a value is assigned
		// usually static
		// by convention, constants are upper case
		// declare constants by using the "final" modifier
		// constants can be public because there's no harm in accessing variable directly if you can't alter it
		System.out.println("Basketball Rules :" + "Time periods" + "," +  "Players fouls allowed" + "," +  "points per free throw");
		System.out.println(TIME_PERIODS + "\t" + PLAYERS_FOULS_ALLOWED + "\t" + POINTS_PER_FREE_THROW);
		
		System.out.println("Football Rules :" + "Points per touchdown" + "," + "points per extra points" + "," + "points per safety");
		System.out.println(POINTS_PER_THOUCHDOWN + "\t" + POINTS_PER_EXTRA_POINT + "\t" + POINTS_PER_EXTRA_POINT);
		
		System.out.println("Soccer Rules :" + "players per team" + "," + "time period" + "," + "gpalies per team");
		System.out.println(PLAYER_PER_TEAM + "\t" + TIME_PERIOD + "\t" + GPALIES_PER_TEAM);
		
		System.out.println("Cricket Rules :" + "Players per team" + "," + "Innings");
		System.out.println(PLAYERS_PER_TEAM + "\t" + INNINGS );
		
		System.out.println("Bowling Rules :" + "frames per game" + "," + "max score" + "," + "pins per frame");
		System.out.println( FRAMES_PRE_GAME+ "\t" + MAX_SCORE + "\t" + PINS_PER_FRAME);
		
	
	}
	
	
}

