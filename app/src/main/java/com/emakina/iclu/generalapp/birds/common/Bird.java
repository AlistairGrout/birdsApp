package com.emakina.iclu.generalapp.birds.common;

/**
 * An Abstract Class cannot be initialized
 */

public abstract class Bird {
    protected String name;
    protected abstract void fly();
    protected abstract void scream(); //abstract method


    protected abstract String getName();

}
