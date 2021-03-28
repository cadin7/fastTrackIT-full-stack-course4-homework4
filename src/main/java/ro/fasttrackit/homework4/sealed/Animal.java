package ro.fasttrackit.homework4.sealed;

public sealed interface Animal permits Dog, Cat, Bird, Insects{
    String type();
    boolean canFly();
}
