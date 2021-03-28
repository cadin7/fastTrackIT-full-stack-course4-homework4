package ro.fasttrackit.homework4.sealed;

public record Cat(String name) implements Animal {
    @Override
    public String type() {
        return "cat";
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
