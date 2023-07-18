package interfaces;

import java.util.ArrayList;

public interface WallBuilder {
    void buildWall();


    class WorkRobot implements WallBuilder {
        @Override
        public void buildWall() {
            System.out.println("WorkRobot build");
        }
    }

    class SecurityRobot implements WallBuilder {
        @Override
        public void buildWall() {
            System.out.println("SecurityRobot");
        }
    }

    class Water {

    }

    public static void main(String[] args) {
        ArrayList robots = new ArrayList<>();
        robots.add(new WorkRobot());
        robots.add(new SecurityRobot());
        robots.add(new Water());

        for (Object robot: robots) {
            if (robot instanceof WallBuilder){
                ((WallBuilder) robot).buildWall();
            }
        }
    }
}
