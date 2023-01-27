public class CompleteByRequestTask implements Task {

    boolean finishTask = false;
    int counter = 0;

    public void execute() {
        if(counter == 1) {
            finishTask = true;
        }
    }

    public void complete() {
        counter++;
    }

    public boolean isFinished() {
        return finishTask;
    }
}
