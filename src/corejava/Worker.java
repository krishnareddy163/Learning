package corejava;

public class Worker {
    public static void main(String[] args){
/*
        PermanentEmployee c = new PermanentEmployee("Krishna", "Contract");
        c.onboarding("Krishna", "Permanent");
*/

        ContractEmployee con = new ContractEmployee();
        con.setAge(23);
        con.setType("Contract");
        con.setEmpName("Test");

        System.out.println(con);
    }
}
