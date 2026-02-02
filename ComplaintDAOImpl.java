import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComplaintDAOImpl implements ComplaintDAO {

    public void addComplaint(ComplaintDTO complaint) {
        String sql = "INSERT INTO complaints(name, email, description, status) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, complaint.getName());
            ps.setString(2, complaint.getEmail());
            ps.setString(3, complaint.getDescription());
            ps.setString(4, "Pending");

            ps.executeUpdate();
            System.out.println("✅ Complaint Registered Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<ComplaintDTO> viewAllComplaints() {
        List<ComplaintDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM complaints";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                ComplaintDTO c = new ComplaintDTO();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setEmail(rs.getString("email"));
                c.setDescription(rs.getString("description"));
                c.setStatus(rs.getString("status"));

                list.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateStatus(int id, String status) {
        String sql = "UPDATE complaints SET status=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, status);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("✅ Status Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
