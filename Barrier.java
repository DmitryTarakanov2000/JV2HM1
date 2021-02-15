public abstract class Barrier {
    private String name;

    public Barrier(String name){
        this.name=name;
    }

    protected abstract boolean moving(Skill skill);
    public  String getName(){
        return name;
    }
}
