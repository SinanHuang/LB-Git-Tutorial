public class IntegerNumber {
    private final int value;

    public IntegerNumber(int value){
        this.value = value;
    }

    public boolean isGreaterThan(IntegerNumber other) {
        return value - other.value > 0;
    }
}
