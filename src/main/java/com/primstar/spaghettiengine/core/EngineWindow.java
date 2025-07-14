package com.primstar.spaghettiengine.core;

import static org.lwjgl.glfw.GLFW.*;

public class EngineWindow {
    //variables
    private int width, heigth;
    private String title;

    private long window;

    //window constructor
    public EngineWindow(int width, int heigth, String title) {
        this.width = width;
        this.heigth = heigth;
        this.title = title;
    }

    public void init() {
        if(!glfwInit()) throw new RuntimeException("glfw could not init");

        //window settings
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE);

        window = glfwCreateWindow(width, heigth, title, 0 ,0);

        glfwSwapInterval(1); //vsync enabled
        glfwMakeContextCurrent(window);

        //shows window
        glfwShowWindow(window);
    }

    public void update() {
        glfwPollEvents(); //updates the window
    }

    public void swapBuffer() {
        glfwSwapBuffers(window); //swap windows buffers
    }

    public boolean close() {
        return glfwWindowShouldClose(window); //returns window should close
    }
}
