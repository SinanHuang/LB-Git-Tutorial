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
        return new IntegerNumber(value+other.getValue());
    }
    
    public IntegerNumber multiply(IntegerNumber other) {
        return new IntegerNumber(value*other.getValue());
    }
}
