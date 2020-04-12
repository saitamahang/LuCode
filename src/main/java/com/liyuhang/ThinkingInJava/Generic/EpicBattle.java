package com.liyuhang.ThinkingInJava.Generic;

/**
 * 泛型的超能力
 */
public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
        hero.getPower().hearSubleNoise();
    }
    static <POWER extends SuperHearing & SuperSmell> void useSuperFind(SuperHero<POWER> hero){
        hero.getPower().hearSubleNoise();
        hero.getPower().trackBySmell();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        useSuperFind(dogBoy);
    }
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

/**
 * 千里眼
 * @param <POWER> 超能力
 */
class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER>{
    public SuperSleuth(POWER power){
        super(power);
    }
    void see(){
        power.seeThtoughWalls();
    }
}

/**
 *
 * @param <POWER>
 */
class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{
    public CanineHero(POWER power){
        super(power);
    }
    void hear(){
        power.hearSubleNoise();
    }
    void smell(){
        power.trackBySmell();
    }
}

class SuperHearSmell implements SuperHearing, SuperSmell{
    public void trackBySmell(){}

    @Override
    public void hearSubleNoise() {

    }
}

class DogBoy extends CanineHero<SuperHearSmell>{
    DogBoy(){
        super(new SuperHearSmell());
    }
}