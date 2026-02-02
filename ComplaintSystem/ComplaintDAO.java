import java.util.List;

public interface ComplaintDAO {

    void addComplaint(ComplaintDTO complaint);

    List<ComplaintDTO> viewAllComplaints();

    void updateStatus(int id, String status);
}
