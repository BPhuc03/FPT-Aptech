package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Book {
    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("book.json")) {

            Object obj = jsonParser.parse(reader);

            JSONArray bookList = (JSONArray) obj;
            System.out.println(bookList);

            bookList.forEach(book -> parserbookList((JSONObject) book));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    private static void parserbookList(JSONObject bookList) {
        JSONObject bookListObject = (JSONObject) bookList.get("book");

        String ID = (String) bookListObject.get("ID");
        System.out.println(ID);

        String Name = (String)  bookListObject.get("Name");
        System.out.println(Name);

        String Price = (String) bookListObject.get("Price");
        System.out.println(Price);

        String author = (String) bookListObject.get("Author");
        System.out.println(author);
    }
}
