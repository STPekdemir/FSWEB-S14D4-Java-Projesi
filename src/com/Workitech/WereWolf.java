package com.Workitech;

public class WereWolf extends Monster implements Bleedable, Poisonable {
    private boolean isPoisonable;
    private boolean isBleedable;

    public WereWolf(String name, int hitPoints, double damage, boolean isPoisonable, boolean isBleedable) {
        super(name, hitPoints, damage);
        this.isPoisonable = isPoisonable;
        this.isBleedable = isBleedable;
    }

    @Override
    public double bleed() {
        return isBleedable ? getDamage() * 0.25 : 0;
    }

    @Override
    public double poison() {
        return isPoisonable ? getDamage() * 0.25 : 0;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }
}
