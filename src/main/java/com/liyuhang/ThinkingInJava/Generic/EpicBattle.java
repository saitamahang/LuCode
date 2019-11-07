package com.liyuhang.ThinkingInJava.Generic;

/**
 * 泛型的超能力
 */
public class EpicBattle {
}

interface SuperPower{}
interface XRayVision extends SuperPower{
    void seeThtoughWalls();
}
interface SuperHearing extends SuperPower{
    void hearSubleNoise();
}
interface SuperSmell extends SuperPower{
    void trackBySmell();
}
class SuperHero<POWER extends SuperPower>{
    POWER power;
    public SuperHero(POWER power){
        this.power = power;
    }
    POWER getPower(){
        return power;
    }
}
