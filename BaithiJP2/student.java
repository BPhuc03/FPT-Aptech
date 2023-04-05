
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class student {
    Scanner sc = new Scanner(System.in);
    ArrayList<TestStudent> list = new ArrayList<>();
    public int add() {
        System.out.printf(" Nhập ID học sinh: ");
        String studentID = sc.nextLine();
        System.out.printf(" Nhập tên học sinh: ");
        String studentName = sc.nextLine();
        System.out.printf(" Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.printf(" Nhập số điện thoại: ");
        String phone = sc.nextLine();

        TestStudent st = new TestStudent(studentID, studentName, address, phone);
        list.add(st);
        return 0;
    }


    public void display(){
        for(TestStudent st : list){
            System.out.println(st.toString());
        }
    }
    public void save(){

        for (TestStudent st : list){

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/baithi","root","");
                String sql = "insert into sinhvien values(?,?,?,?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1,st.getStudentID());
                pst.setString(2,st.getStudentName());
                pst.setString(3,st.getAddress());
                pst.setString(4,st.getPhone());

                int check = pst.executeUpdate();

                if (check>0){
                    System.out.println("Lưu thành công!");
                }else {
                    System.out.println("Lưu thất bại!");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        list.clear();


    }
}