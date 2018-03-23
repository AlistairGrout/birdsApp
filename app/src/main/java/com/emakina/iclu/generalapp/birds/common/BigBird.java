package com.emakina.iclu.generalapp.birds.common;

/**
 * Created by iclu on 21/03/2018.
 */

public abstract class BigBird extends Bird{

    protected String unicornHorn;
    protected String arms;

    protected abstract void jump();
    protected abstract void teleport();

    protected abstract String getUnicornHorn();
    protected abstract String getArms();

}
