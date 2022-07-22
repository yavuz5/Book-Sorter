public class Horses extends Animals {
    public Horses(String name,int weight,int yas) {
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
