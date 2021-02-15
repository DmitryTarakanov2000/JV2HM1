public class Wall extends Barrier {
    private int height;
    public Wall(String name, int height){
        super(name);
        this.height=height;
    }
    public int getHeight(){
        return height;
    }

    @Override
    protected boolean moving(Skill skill){
        System.out.println("стена"+ super.getName() + "высотой" + this.height);

        skill.jump();

        if (getHeight() <= skill.getJumpHeight()) {
            System.out.println("прыгнул");
            return true;
        }
        else{
            System.out.println("не прыгнул");
            return false;
        }
    }



}
