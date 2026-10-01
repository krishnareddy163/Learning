package corejava;

public class ContractEmployee  extends RegularEmployee{
    private String empName;
    private String type;
    private int age;

   /* public ContractEmployee(String empName, String type) {
        this.empName = empName;
        this.type = type;
    }

    public ContractEmployee(String empName, String type, int age) {
        this.empName = empName;
        this.type = type;
        this.age = age;
    }
*/

    public void onboardingwithage(String empName, String type, int age){
        System.out.println("Emp name"+empName+ "type"+type+"age"+age);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "empName='" + empName + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void onBoarding(String name) {

    }

    public void rateofintrest(int amount){
        System.out.println("amount:"+amount);
    }
}
