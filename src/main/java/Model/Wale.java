package Model;



public class Wale {
    Idea idea;
    private String name;
    Time time;
    NaturePosition naturePosition;

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public Wale(String name) {
        this.name = name;
    }

    public Idea getIdea() {
        return idea;
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Boolean isNaturePosition(String p) {
        boolean b;
        for (NaturePosition pos : NaturePosition.values()) {
            if (p == NaturePosition.values().toString()) {
                b = true;
                this.time.value++;
            }

            else{
                b = false;
            this.time.value--;
            }
        }
        if (b=true) {
            return true;


        } else return false;

    }
    public void think(){
        System.out.println(this.name + " думает, что он несчастный");
        this.time.value--;

    }
    public String toBeOrNot() {
        if (this.time.value <= 0) {
            return name + "не является китом";
        } else return name + " уверен, что он кит";
    }



}











