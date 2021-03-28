package ro.fasttrackit.homework4.sealed;

public non-sealed class Chicken implements Bird{
    @Override
    public String type() {
        return "chicken";
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
