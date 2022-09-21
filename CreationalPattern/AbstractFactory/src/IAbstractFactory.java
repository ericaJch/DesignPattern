public interface IAbstractFactory<T> {
    T create(String type);
}
