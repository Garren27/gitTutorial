/**
 * Created by ethan on 2017-02-07.
 */
public class Instructor extends Person {
    String title;
    Course favcourse;

    public Instructor(String name, String emailAddress, String title, Course favcourse){
        super(name,emailAddress);
        this.title=title;
        this.favcourse = favcourse;
    }

    public String toString(){
        return String.format("Name: %s\nTitle: %s\nEmail: %s", this.name, this.title, this.emailAddress);
    }
}
