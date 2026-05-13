abstract class Rabbit{}

class HouseRabbit extends Rabbit{}

interface Rabbit2 {
    String move(int x, int y);
}

class HouseRabbit2 implements Rabbit2 {
    @Override
    public String move(int x, int y) {
        return "";
    }
}