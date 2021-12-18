package Less6;

import java.util.concurrent.ThreadLocalRandom;

public class Cross {
    private  int duration;

    public Cross(int duration){
        this.duration = duration;
    }
    public void printInfo() {
        System.out.println(this);
            }
@Override
    public String toString() {
    return "Cross{" + "duration=" + duration + '}';

   /* public void run(Cross cross){
        cross.decreaseDuration(ThreadLocalRandom.current().nextInt(5)+2);
    }
*/
}
}
