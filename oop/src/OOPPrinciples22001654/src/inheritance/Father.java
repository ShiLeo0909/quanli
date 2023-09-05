package inheritance;

public class Father {
    private String name;
    private int old;
    private boolean gender = true;

    public String Speak() {
        return "Hello";
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public boolean isGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
