package java.org.team_hydra_2023;

public class Monster extends ActorForMonsterAndPlayer {
    private int monsterID;
    private String monsterName;
    private String monsterDescription;

    public Monster (int monsterID, int healthPoints, int attackStat, int defenseStat , String monsterName, String monsterDescription){
        super(healthPoints, attackStat, defenseStat);
        this.monsterID = monsterID;
        this.monsterName = monsterName;
        this.monsterDescription = monsterDescription;
    }

    public int getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }
}
