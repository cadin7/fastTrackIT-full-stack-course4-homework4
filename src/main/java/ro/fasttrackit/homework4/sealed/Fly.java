package ro.fasttrackit.homework4.sealed;

public class Fly implements Insects{
    @Override
    public String type() {
        return "fly";
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean isDisgusting() {
        return true;
    }
}
