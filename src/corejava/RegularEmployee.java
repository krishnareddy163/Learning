package corejava;

public abstract class RegularEmployee {

    public abstract void onBoarding(String name);

    public void rateofintrest(int amount){
        System.out.println("amount:"+amount);
    }

    public void rateofintrest(int amount, String personNam){
        System.out.println("amount:"+amount);
    }
}
