import java.util.ArrayList;
import java.util.List;

public class DataBaseSingletonExample {
    private final List<String> list;
    private static DataBaseSingletonExample dbObject;


    public void insertIntoList(String s) {
        list.add(s);
    }

    public List<String> getList() {
        return list;
    }

     DataBaseSingletonExample() {
        list = new ArrayList<>();
    }

    public static DataBaseSingletonExample getInstance() {
        if (dbObject == null) {
            dbObject = new DataBaseSingletonExample();
        }
        return dbObject;
    }
}
