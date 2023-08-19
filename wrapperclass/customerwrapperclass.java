package wrapperclass;

public class customerwrapperclass {
    private int name;
    
    public customerwrapperclass(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return Integer.toString(name);
    }
    
    public static void main(String[] args) {
        
        customerwrapperclass cus = new customerwrapperclass(234);
        System.out.println(cus.toString());
    }

}
