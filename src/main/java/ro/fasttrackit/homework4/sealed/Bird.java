package ro.fasttrackit.homework4.sealed;

public sealed interface Bird extends Animal permits Chicken, Parrot, Canary {
}
