package com.javarush.test.level14.lesson06.home01;

/**
 * Created by us on 23.06.2015.
 */
class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 0;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - "+Country.RUSSIA+". Я несу "+Integer.toString(getCountOfEggsPerMonth())+" яиц в месяц.";
    }
}
