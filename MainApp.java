import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComplaintService service = new ComplaintService();

        while (true) {
            System.out.println("\n--- Complaint Registration System ---");
            System.out.println("1. Register Complaint");
            System.out.println("2. View All Complaints");
            System.out.println("3. Update Complaint Status");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    ComplaintDTO c = new ComplaintDTO();
                    System.out.print("Enter Name: ");
                    c.setName(sc.nextLine());
                    System.out.print("Enter Email: ");
                    c.setEmail(sc.nextLine());
                    System.out.print("Enter Complaint: ");
                    c.setDescription(sc.nextLine());

                    service.registerComplaint(c);
                    break;

                case 2:
                    service.showAllComplaints();
                    break;

                case 3:
                    System.out.print("Enter Complaint ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Status: ");
                    String status = sc.nextLine();

                    service.changeStatus(id, status);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
