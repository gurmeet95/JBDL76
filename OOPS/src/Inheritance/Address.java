package Inheritance;

public class Address {
   private String pinCode;
   private String city;
   public Address(String pinCode,String city){
       this.pinCode=pinCode;
       this.city=city;
   }


    public String getCity() {
        return city;
    }



    public String getPincode() {
        return pinCode;
    }
    @Override
    public String toString() {
        return "City: " + city + ", Pincode: " + pinCode;
    }
    /* To print the values of city and pinCode for s1.getAddress()
    instead of a memory address, you need to override the toString method
    in your Address class.
    When you call System.out.println(s1.getAddress());,
    the overridden toString method will be invoked,
     and the output will include the city and pinCode.
     */

}
