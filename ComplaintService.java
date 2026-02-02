import java.util.List;

public class ComplaintService {

    private ComplaintDAO dao = new ComplaintDAOImpl();

    public void registerComplaint(ComplaintDTO complaint) {
        dao.addComplaint(complaint);
    }

    public void showAllComplaints() {
        List<ComplaintDTO> list = dao.viewAllComplaints();

        System.out.println("\n---- Complaints List ----");
        for (ComplaintDTO c : list) {
            System.out.println(
                c.getId() + " | " +
                c.getName() + " | " +
                c.getEmail() + " | " +
                c.getDescription() + " | " +
                c.getStatus()
            );
        }
    }

    public void changeStatus(int id, String status) {
        dao.updateStatus(id, status);
    }
}
