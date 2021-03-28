package ro.fasttrackit.homework4.sealed;

//Records cannot extend another class. Thus, 'sealed classes' + 'records' don't work at all. Source: https://stackoverflow.com/questions/62441124/when-are-sealed-classes-and-records-used-together-in-java
public record Canary(String colour) implements Bird{
    @Override
    public String type() {
        return "canary";
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
