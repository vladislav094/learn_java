package jrush;

public class Car3 {
    Engine engine;
    class Engine{

        private boolean isRunning;

        public void start(){
            isRunning = true;
        }

        public void stop(){
            isRunning = false;
        }

    }
}
