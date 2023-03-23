package com.epam.lecture.decorator;

public abstract class EffectDecorator implements Drawable {

    protected Drawable figure;

    public EffectDecorator(Drawable figure) {
        this.figure = figure;
    }

    public void draw() {
        figure.draw();
    }
}
