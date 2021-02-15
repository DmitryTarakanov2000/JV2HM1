public class Human implements Skill {
    private String name;
    private int rundist;
    private int jumpheight;

    public Human(String name, int distance, int jumpheight){
        this.name= name;
        this.rundist= distance;
        this.jumpheight= jumpheight;
    }



@Override
public void run() {
    System.out.println("человек" + this.name + "бежит" + this.getRunDistance());
}

@Override
public void jump(){
    System.out.println("человек"+ this.name + "прыгает" + this.getJumpHeight());
    }
    @Override
    public int getRunDistance() {
        return this.rundist;
    }
    @Override
    public int getJumpHeight(){
        return this.jumpheight;
    }
}
