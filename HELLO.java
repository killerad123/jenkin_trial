class HELLO{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is a simple Java program.");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Passed param " + args[i]);
        }
    }
}