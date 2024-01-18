package com.workintech.game;

public class Scorpion extends Monster implements Poisonable{
    public Scorpion(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }

    @Override
    public double attack() {
        return getDamage()+poison();
    }
}
