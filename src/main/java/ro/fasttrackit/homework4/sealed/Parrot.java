package ro.fasttrackit.homework4.sealed;

final public class Parrot implements Bird {
    @Override
    public String type() {
        return "parrot";
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
