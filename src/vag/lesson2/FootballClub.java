package vag.lesson2;

public class FootballClub {
    private String name;
    private int est;
    private String coach;
    private String Color;
    private boolean isChampion;
    //
    // public FootballClub() {
    // }
    public FootballClub(String name, int est, String coach, vag.lesson2.Color Color, boolean isChampion) {
        this.name = name;
        this.est = est;
        this.coach = coach;
        this.Color = String.valueOf(Color);
        this.isChampion = isChampion;
    }
    @Override
    public String toString() {
        return "FootballClub{" +
                "name='" + name + '\'' +
                ", est=" + est +
                ", coach='" + coach + '\'' +
                ", Color='" + Color + '\'' +
                ", isChampion=" + isChampion +
                '}';
    }
    public String getname() {
        return name;
    }
    public int getest() {
        return est;
    }
    public String getcoach() {
        return coach;
    }
    public String getColor() {
        //return String.valueOf(Color);
        return Color;
    }
    public boolean isChampion() {
        return isChampion;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setest(int est) {
        this.est = est;
    }
    public void setcoach(String coach) {
        this.coach = coach;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public void setChampion(boolean champion) {
        this.isChampion = champion;
    }
}
