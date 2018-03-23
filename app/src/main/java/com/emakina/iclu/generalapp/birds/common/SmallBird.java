package com.emakina.iclu.generalapp.birds.common;

/**
 * Created by iclu on 21/03/2018.
 */

public abstract class SmallBird extends Bird{

    protected String antennas;
    protected String ratTail;

    protected abstract String getAntennas();
    protected abstract String getRatTail();

    protected abstract void tiptoe();
    protected abstract void disappear();

}
