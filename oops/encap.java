package oops;

public class encap {
    private int id;
    private String name;
    private String address;
    private int phone;
    
    public encap(int id, String name, String address, int phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "encap [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
    }

    public static void main(String[] args) {
        encap info = new encap(20106062,"Vasanth","Salem",99876573);
        System.out.println(info.toString());
    }
}
