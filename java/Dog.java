public class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
       return breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        // Create two Dog objects
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
        // Modify attributes using setter methods
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");
        // Print updated values
        System.out.println(dog1.getName() + " is now a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
       
    }
}
