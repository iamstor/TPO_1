package Model;

public class Time {

    public int value;
    public String description;

    public Time(int value) {
        this.value = value;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}