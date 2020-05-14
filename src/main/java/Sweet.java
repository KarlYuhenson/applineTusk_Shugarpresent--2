public abstract class Sweet {
    private String name;
    private int weight;
    private int price;
    private String haveNuts;

    Sweet( String name, int weight, int price, String haveNuts) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.haveNuts = haveNuts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getHaveNuts() {
        return haveNuts;
    }
    public void setHaveNuts(String haveNuts) {
        this.haveNuts = haveNuts;
    }

    @Override
    public String toString() {
        return "Название: " + name +
                ", Вес: " + weight +
                ", Цена: " + price;
    }
}
