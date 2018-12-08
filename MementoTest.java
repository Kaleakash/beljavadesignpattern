class PlayerStatus {
	private int playerPoint;
	private int playerLevel;
	public void setPlayerPoint(int playerPoint ) {
		this.playerPoint = playerPoint;
	}
	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}
	public int getPlayerPoint(){
		return playerPoint;
	}
	public int getPlayerLevel() {
		return playerLevel;
	}
}
class PlayerStatusMemento {
	private PlayerStatus playerStatus;
	public void setPlayerStatus(PlayerStatus playerStatus) {
		this.playerStatus = playerStatus;
	}
	public PlayerStatus getPlayerStatus() {
		return playerStatus;
	}
}
class CurrentPlayerStatus {
	private int playerPoint =0;
	private int playerLevel = 1;
	public void setStatusFromMemento(PlayerStatusMemento playerStatusMemento) {
		playerPoint = playerStatusMemento.getPlayerStatus().getPlayerPoint();
		playerLevel = playerStatusMemento.getPlayerStatus().getPlayerLevel();
	}
	public PlayerStatusMemento createMementoFromStatus() {
		PlayerStatusMemento memento = new PlayerStatusMemento();
		PlayerStatus status = new PlayerStatus();
		status.setPlayerLevel(this.playerLevel);
		status.setPlayerPoint(this.playerPoint);
		memento.setPlayerStatus(status);
		return memento;		
	}
	public void setPlayerPoint(int playerPoint ) {
		this.playerPoint = playerPoint;
	}
	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}
	public int getPlayerPoint(){
		return playerPoint;
	}
	public int getPlayerLevel() {
		return playerLevel;
	}
}
public class MementoTest {
	public static void main(String args[]) {
	PlayerStatusMemento memento;
	System.out.println("Game Started.....");
	CurrentPlayerStatus status = new CurrentPlayerStatus();
	status.setPlayerPoint(12000);
	status.setPlayerLevel(2);
	System.out.println("Player reached 2nd level with point 12000");
	System.out.println("Player point "+status.getPlayerPoint()+" with level of game "+status.getPlayerLevel());
	System.out.println("Player current status");
	memento = status.createMementoFromStatus();
	status.setPlayerPoint(34000);
	status.setPlayerLevel(4);
	System.out.println("Player reached 4t level with point 34000");
	System.out.println("Player point "+status.getPlayerPoint()+" with level of game "+status.getPlayerLevel());
	System.out.println("Player current status");
	System.out.println("At this level player lost and move to status saved in memento");
	status.setStatusFromMemento(memento);
	System.out.println("Player point "+status.getPlayerPoint()+" with level of game "+status.getPlayerLevel());
	System.out.println("Player current status");
	}
}	