public class Computer {

    private String name;
    private int wins;

    public Computer(String name, int wins) {
        this.name = name;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", wins=" + wins +
                '}';
    }

    public void addWin(){
        wins++;
    }
}
