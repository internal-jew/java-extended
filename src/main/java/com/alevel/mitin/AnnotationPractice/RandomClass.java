package com.alevel.mitin.AnnotationPractice;

public class RandomClass {

    @Documentation(text = "Documentation")
    void randomMethod(@Documentation(text = "random") int random) {
    }

    @Documentation(text = "random1", since = "2.0")
    void anotherRandom(@Documentation(text = "random1 parameter") double random) {

    }
}
