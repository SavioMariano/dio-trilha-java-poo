public record Person(String name, int age) {

    public Person{
        System.out.println("Nome " + name);
        System.out.println("idade " + age);
    }


}
