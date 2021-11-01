public class Dog extends Pet {
        // Instance variable(s)
    private String breed;

        // Constructors
    public Dog(String a, int b, String c) {
        super(a, b);
        this.breed = c;
    }
    public Dog(){
        breed = "shiba inu";
    }
        // makeNoise() method
        public void makeNoise() {
            System.out.println("Woof!");
        }

        // toString method
        public String toString() {
            String str = "Name: " + getName() + ", Age: " + getAge() + "Breed: " + breed;
            return str;
        }

        // Getter
        public String getBreed() {
            return this.breed;
        }

        // Setter
        public void setBreed(String breed) {
            this.breed = breed;
        }

}