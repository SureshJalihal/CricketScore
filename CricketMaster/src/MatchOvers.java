
public class MatchOvers {
	private int overBalls[]=new int[6];
	private int totalRunsOver=0;
	int CurrentBall=0;
	
	public void addRunsperBall(int runs){
		overBalls[CurrentBall]=runs;
		CurrentBall++;
		totalRunsOver+=runs;
	}
	public int getScorePerOver(){
		return totalRunsOver;
	}
	public void printScorePerBallInCurrentOver(){
		for(int i=0; i<CurrentBall;i++){
			System.out.println("\tBall "+(i+1)+" : "+overBalls[i]);
		}
	}
	public int getRunsPreBall(){
		return this.overBalls[CurrentBall-1];
	}
}
