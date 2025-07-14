package com.primstar.spaghettiengine.core;

public abstract class EngineApplication {

    //abstract voids
    protected abstract void cleanup();

    public abstract void init();
    public abstract void update();
    public abstract void input();
    public abstract void render();
}
