package day26polymorphism;

public class Cat extends Animal {
    public void meow() {
        System.out.println("Cats meow...");
    }

    //Override anotation Override kurallarinin java tarafindan kontrol edilmesini saglar
    public void eat() {
        System.out.println("Cats eat...");
    }

    //Child daki override edilmiş eat() methoduna Overriding Method denir
    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }
}
