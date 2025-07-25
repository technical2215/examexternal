public class studentdetails {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide name, roll number, and branch as arguments.");
            System.exit(1);
        }
        String name = args[0];
        int rollNo = Integer.parseInt(args[1]);  
        String branch = args[2];
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}
