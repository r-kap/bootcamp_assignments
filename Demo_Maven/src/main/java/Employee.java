public class Employee {

    private String name;
    private int id;
    private int dept_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public Employee(String name, int id, int dept_id){
        this.name = name;
        this.id = id;
        this.dept_id = dept_id;
    }

    public String toString()
    {
        return this.name+" "+this.id+" "+this.dept_id;
    }
}
