
public class MatchScoreBoardDetail {
	private int TotalOvers=0;
	private MatchOversDetail[] overs;
	private int totalBalls;
	
	
	public MatchScoreBoardDetail() {
		super();
		
		overs=new MatchOversDetail[10];
		overs[0]=new MatchOversDetail();
	}
	public void addBalls(int runs){
		
		overs[TotalOvers].addRunsperBall(runs);
		totalBalls++;
		if(totalBalls%6==0){
			TotalOvers++;
			overs[TotalOvers]=new MatchOversDetail();
		}
	}
	public int getCurrentBall(){
		return this.overs[TotalOvers-1].getRunsPreBall();
	}
	

	public int getCurrentScore(){
		int currentScore=0;
		for(int i=0;i<TotalOvers;i++){
			currentScore+=overs[i].getScorePerOver();
		}
		return currentScore;
	}
	public void printScoreCard(){
		System.out.println("CurrentScore: "+ this.getCurrentScore());
	}
	public void getScorePer(){
		for(int i=0;i<TotalOvers;i++){
			System.out.println("Over 1: "+(i+1)+" Runs: "+overs[i].getScorePerOver());
			overs[i].printScorePerBallInCurrentOver();
		}
	}
}	

