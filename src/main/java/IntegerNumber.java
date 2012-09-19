import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class IntegerNumber {
    private final int value;

    public IntegerNumber(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isGreaterThan(IntegerNumber other) {
        return value - other.value > 0;
    }

    public IntegerNumber add(IntegerNumber other) {
        throw new NotImplementedException(); // 亲，等你来实现
    }
}
