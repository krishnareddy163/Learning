package corejava;

public class Employee {

    private String empName;

    public String onboarding(String empName, String type){
        System.out.println("Onbaorded "+type);
        return "Onboarded along with type"+ type;
    }

}
