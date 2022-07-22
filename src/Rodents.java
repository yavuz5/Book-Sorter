public class Rodents extends Animals {
    public Rodents(String name,int weight,int yas) {
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
