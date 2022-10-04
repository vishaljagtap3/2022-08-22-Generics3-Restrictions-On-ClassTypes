public class Holder<T extends Number> {
    private T data;

    public Holder(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
