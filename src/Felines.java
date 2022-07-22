public class Felines extends  Animals {
    public Felines(String name,int weight,int yas) {
        super(name,weight,yas);
    }

    @Override
    public int getDosage() {
        return 0;
    }

    @Override
    public int getFeedSchedule() {
        return 0;
    }
}
