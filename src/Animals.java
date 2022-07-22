public abstract class Animals {
    private String typeName;
    private Integer weight;
    private Integer age;

    public Animals(String typeName, Integer weight, Integer age) {
        this.typeName = typeName;
        this.weight = weight;
        this.age = age;
    }

    public abstract int getDosage();
    public abstract int getFeedSchedule();

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
