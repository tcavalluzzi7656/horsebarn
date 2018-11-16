public class Mustang implements horse {
    private String name;
    private int weight;
    public Mustang (String name,int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
