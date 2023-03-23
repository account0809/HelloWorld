package com.epam.lecture.decorator;

public class ShadowDecorator extends EffectDecorator {

    public ShadowDecorator(Drawable figure) {
        super(figure);
    }

    public void draw() {
        figure.draw();
        drawShadow();
    }

    private void drawShadow() {
        System.out.println("Draw shadow effect");
    }
}
