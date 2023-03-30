package HomeWorkSeminar2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        Action[] actions = new Action[3];
        actions[0] = human;
        actions[1] = cat;
        actions[2] = robot;

        Wall wall = new Wall(2.0);
        RunningTrack runningTrack = new RunningTrack(16.0);

        Parameter[] parameters = new Parameter[2];
        parameters[1] = wall;
        parameters[0] = runningTrack;

        System.out.println("Высота стены = " + wall);
        System.out.println("Длина беговой дорожки = " + runningTrack);
        Competition(actions, parameters);
    }
    public static void Competition(Action[] actions, Parameter[] parameters){
        System.out.println();
        for (Action action : actions) {
            boolean checkRun = action.Run(parameters[0].getParameterSize());
            if(checkRun)
                action.Jump(parameters[1].getParameterSize());
        }
    }
}
