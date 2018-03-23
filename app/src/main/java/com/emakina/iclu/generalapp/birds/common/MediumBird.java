package com.emakina.iclu.generalapp.birds.common;

/**
 * Created by iclu on 21/03/2018.
 */

public abstract class MediumBird extends Bird{

    protected String elfEars; //proprietés de class
    protected String legs;

    protected abstract void run(); //méthode commune à MediumBird et ses enfants
    protected abstract void transform();

    protected abstract String getElfEars();
    protected abstract String getLegs();



}
