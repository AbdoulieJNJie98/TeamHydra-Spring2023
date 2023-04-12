package java.org.team_hydra_2023;

public class ActorForMonsterAndPlayer {

        private int healthPoints;
        private int attackStat;
        private int defenseStat;

        public ActorForMonsterAndPlayer (int healthPoints, int attackStat, int defenseStat){
            this.healthPoints = healthPoints;
            this.attackStat = attackStat;
            this.defenseStat = defenseStat;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }

        public int getAttackStat() {
            return attackStat;
        }

        public void setAttackStat(int attackStat) {
            this.attackStat = attackStat;
        }

        public int getDefenseStat() {
            return defenseStat;
        }

        public void setDefenseStat(int defenseStat) {
            this.defenseStat = defenseStat;
        }
    }

