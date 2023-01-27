public class CountDownTask implements Task {
    int taskValue;

    public CountDownTask(int value) {
        if (value <= 0) {
            value = 0;
        }
        taskValue = value;
    }

    public int getValue() {
        return taskValue;
    }

    public void execute() {
        if (taskValue > 0){
            taskValue = taskValue-1;
        }
    }
    public boolean isFinished() {
        return taskValue == 0;
    }

}