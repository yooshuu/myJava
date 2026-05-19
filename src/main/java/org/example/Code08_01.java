package org.example;

abstract class Rabbit1 {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}

class HouseRabbit extends Rabbit1 {
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}


class MountainRabbit extends Rabbit1 {
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_01 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
