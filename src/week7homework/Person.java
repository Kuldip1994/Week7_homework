package week7homework;

public class Person {
    public String firstname;
    public String lastname;
    public    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstname(""); // firstName is set to empty string
        person.setLastname(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstname("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastname("Smith"); // lastName is setto Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public String getFirstname()
    {
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname){
        this.firstname=firstname;

    }
    public void setLastname(String lastname){
        this.lastname=lastname;

    }
    public void setAge(int age){
        if(age > 0 && age <= 100) {
            this.age=age;
        }else {
            this.age=0;
        }
    }
    public boolean isTeen (){
        if (age > 12 && age <20){
            return true;

        }
        return false;
    }

    public String getFullName (){
        if (firstname.isEmpty()){
            return lastname;
        }
        if (lastname.isEmpty()) {
            return firstname;
        }
        if (firstname.isEmpty() && lastname.isEmpty()){
            return "";
        }
        else {
            return firstname + " "+ lastname;
        }
    }
}
