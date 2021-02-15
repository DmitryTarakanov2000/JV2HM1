public class Road extends Barrier {
    private int lenght;
    public Road(String name, int lenght) {
        super(name);

        this.lenght=lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    protected  boolean moving(Skill skill){
        System.out.println("Дорога" + super.getName() + "длиной" + this.lenght);
        skill.run();

        if (getLenght() <= skill.getRunDistance()) {
            System.out.println("пробежал");
            return true;
        }
        else {
            System.out.println("не пробежал");
            return false;
        }
        }
    }


