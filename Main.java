import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Skill[] skill = new Skill[3];

        int distance = random.nextInt(10);
        int height = random.nextInt(10);
        skill[0] = new Human("Человек", distance, height);
        distance= random.nextInt(10);
        height = random.nextInt(10);
        skill[1]= new Robot("Robot", distance, height);
        skill[2]= new Cat("кошка ",distance,height);

        Barrier[] barriers = new Barrier[6];

        boolean Road;
        for (int i=0; i < random.nextInt(10);i++) {
            Road = random.nextBoolean();
            if (Road) {
                barriers[i] = new Road("дорога " + i, distance);
            } else {
                barriers[i] = new Wall("Стена" + i, distance);
            }
        }
        for (int i=0;i< skill.length; i++){
            boolean result = true;
            for (int j =0; j< barriers.length; j++){
                result = barriers[j].moving(skill[i]);
                if (!result) {
                    break;
                }
            }
            if (result){
                System.out.println("Успешно");
            }
            else {
                System.out.println("не успешкно");
            }





        }

    }
}
