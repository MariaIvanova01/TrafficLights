package com.company;

public class TrafficLite {
    private ColorTrafficLite currentColor;

    public TrafficLite(ColorTrafficLite currentColor) {
        this.currentColor = currentColor;
    }

    public ColorTrafficLite getCurrentColor() {
        return currentColor;
    }

    public void changeColor(){
        if (currentColor.equals(ColorTrafficLite.RED)){
            currentColor = ColorTrafficLite.GREEN;
        }else if (currentColor.equals(ColorTrafficLite.GREEN)){
            currentColor = ColorTrafficLite.YELLOW;
        }else if (currentColor.equals(ColorTrafficLite.YELLOW)){
            currentColor = ColorTrafficLite.RED;
        }
    }
}
