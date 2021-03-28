package ro.fasttrackit.homework4.sealed;

public final class Dog implements Animal {
    @Override
    public String type() {
        return "dog";
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
