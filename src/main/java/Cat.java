import org.springframework.stereotype.Component;

public class Cat {
    private String name;
    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void catHello() {
        System.out.println("Привет, я кот " + name);
    }

}
