import java.util.ArrayList;
import java.util.List;

/*Cloneable is an interface that is used to create the exact copy of an object.
 It exists in java. lang package.
  A class must implement the Cloneable interface if we want to create the clone of the class object.
  The clone() method of the Object class is used to create the clone of the object.*/
public class Employees implements Cloneable {
    private List<String> employeList;

    public Employees() {
        employeList=new ArrayList<>();
    }

    public Employees(List<String> employeList) {
        this.employeList = employeList;
    }

    public void loadDate(){
        employeList.add("element1");
        employeList.add("element2");
        employeList.add("element3");
    }

    public List<String> getEmployeList() {
        return employeList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        temp.addAll(this.getEmployeList());
        return new Employees(temp);
    }

}
