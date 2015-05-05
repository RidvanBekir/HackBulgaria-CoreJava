package InsertingNullNotAllowed;

public class MainClass {

    public static void main(String[] args) {

        try {
            MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();
            myHashMap.setNotAllowNull();
            myHashMap.put(null, "Java");
            myHashMap.put("Core", null);
            System.out.println(myHashMap.toString());
        } catch (NullValueException e) {
            System.err.println(e.getMessage());
        }
    }

}
