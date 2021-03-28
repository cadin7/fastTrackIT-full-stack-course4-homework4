package ro.fasttrackit.homework4.sealed;

public record Ladybug(int dots) implements Insects {
    @Override
    public String type() {
        return "ladybug";
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean isDisgusting() {
        return false;
    }
}
