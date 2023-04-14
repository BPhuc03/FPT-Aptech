package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
public class BookRead {
    @SuppressWarnings("unchecked")

    public static void main(String[] args) {

        JSONObject bookListDetails1 = new JSONObject();
        bookListDetails1.put("ID","01");
        bookListDetails1.put("Name", "Rich Dad, Poor Dad");
        bookListDetails1.put("Price", "200000");
        bookListDetails1.put("Author", " Robert Kiyosaki Sharon Lechter");
        JSONObject bookListOject1 = new JSONObject();
        bookListDetails1.put("Book", bookListDetails1);


        JSONObject bookListDetails2 = new JSONObject();
        bookListDetails2.put("ID","02");
        bookListDetails2.put("Name", "Nhà giả kim");
        bookListDetails2.put("Price", "189000");
        bookListDetails2.put("Author", "Paulo Coelho");
        JSONObject bookListOject2 = new JSONObject();
        bookListDetails2.put("Book", bookListDetails2);

        JSONArray bookList = new JSONArray();
        bookList.add(bookListOject1);
        bookList.add(bookListOject2);

        try ( FileWriter file = new FileWriter("Book3.json")) {
            file.write(bookList.toJSONString());
            file.flush();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
