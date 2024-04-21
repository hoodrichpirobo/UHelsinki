
public class ItemIII {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        if(name == null) {
            return item.name == null;
        } else {
            return name.equals(item.name);
        }
    }
    
    @Override
    public int hashCode(){
        return name != null ? name.hashCode() : 0;
    }

}
