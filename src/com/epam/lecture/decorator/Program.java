package com.epam.lecture.decorator;

public class Program {

    public static void main(String[] args) {
        Drawable cube = new Cube();
        cube.draw();

        Drawable cubeWithShadow = new ShadowDecorator(cube);
        cubeWithShadow.draw();
    }
}
