public class Message {
    int message_id;
    String message;
    String message_author;
    String message_date;

    public Message(){
    }

    public Message(String message, String message_author, String message_date) {
        this.message = message;
        this.message_author = message_author;
        this.message_date = message_date;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage_author() {
        return message_author;
    }

    public void setMessage_author(String message_author) {
        this.message_author = message_author;
    }

    public String getMessage_date() {
        return message_date;
    }

    public void setMessage_date(String message_date) {
        this.message_date = message_date;
    }
}
