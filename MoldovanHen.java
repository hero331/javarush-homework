package com.javarush.test.level14.lesson06.home01;

/**
 * Created by us on 23.06.2015.
 */
public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }
    public String getDescription() {
        return super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+Integer.toString(getCountOfEggsPerMonth())+" яиц в месяц.";
    }
}
