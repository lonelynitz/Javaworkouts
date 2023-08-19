package inner_class;

public class member_innerclass{
    private String name ;
    private int rollno;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    class access{
        void every(){
            System.out.println("Welcome : " + name + " Register No: " + rollno);
        }
    }

    public static void main(String[] args) {
        
        member_innerclass obj = new member_innerclass();
        member_innerclass.access info = obj.new access();

        obj.setName("vasanth");
        obj.setRollno(20106062);
        info.every();

    }
}