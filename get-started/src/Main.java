public class Main {
    public static void main(String[] args) throws Exception {
    
        var male = new Person();
        male.setName("Joao");
        male.setAge(17);
        var female = new Person();
        female.setName("Larissa");
        female.setAge(18);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

    }
}
