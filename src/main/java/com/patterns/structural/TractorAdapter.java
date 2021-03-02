package com.patterns.structural;

public class TractorAdapter implements Movable{

    private Tractor tractor = new Tractor();

    @Override
    public void speedUp(double quantity) {
        if (this.tractor.getSpeed() + quantity < 15){
            this.tractor.changeMode(1);
        } else {
            this.tractor.changeMode(2);
        }
    }

    @Override
    public void brake(double quantity) {
        if(this.tractor.getSpeed() - quantity <= 0){
            this.tractor.setSpeed(0);
        }else{
            this.tractor.setSpeed(tractor.getSpeed() - quantity);
        }

    }
    public double getSpeed() {
        return this.tractor.getSpeed();
    }
}
