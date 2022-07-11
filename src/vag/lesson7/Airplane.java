package vag.lesson7;

public class Airplane {
    private String name;
    private Wing wing;

    public Airplane(String name, int w) {
        this.name = name;
        wing = new Wing();
        this.wing.setWeight(w);
    }

    public void airplaneInfo() {
        System.out.println(this.name);
        this.wing.airplaneInfo();
    }

    public class Wing {
        private int weight;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void airplaneInfo() {
            System.out.println(" Крыло весит" + this.weight);
        }
    }
}
