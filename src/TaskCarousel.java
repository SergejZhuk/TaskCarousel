public class TaskCarousel  {

    int index = 0;
    int arrayCapacity;
    int[] array;

    boolean arrayFull = false;

    public TaskCarousel(int capacity) {
        arrayCapacity = capacity;
        array = new int[capacity];
    }

    public boolean addTask(Task task) {
        if(!task.isFinished() && !arrayFull) {
            array[index] = 1;
            index++;
            return true;
        }
       return false;
    }

    public boolean execute() {
        return false;
    }

    public boolean isFull() {
        int sum1 = 0;
        for (int i = 0; i < arrayCapacity; i++) {
            sum1 = sum1 + array[i];
        }
        if (sum1 == 0){
            return false;
        }
        return sum1 == arrayCapacity;
    }


    public boolean isEmpty() {
        int sum = 0;
        for (int i = 0; i < arrayCapacity; i++) {
            sum = sum + array[i];
        }
        return sum == 0;
    }

    public static void main(String[] args) {
        TaskCarousel carousel = new TaskCarousel(4);

        System.out.println(carousel.isEmpty()); //true
        System.out.println(carousel.isFull()); //false
        System.out.println(carousel.execute()); //false

        CountDownTask task = new CountDownTask(2);
        System.out.println(carousel.addTask(task)); //true

        System.out.println(carousel.isEmpty()); //false
        System.out.println(carousel.isFull()); // false

        System.out.println(task.getValue()); //2
        System.out.println(carousel.execute()); //true
        System.out.println(task.getValue()); //1
        System.out.println(carousel.execute()); //true
        System.out.println(task.getValue()); //0

        System.out.println(carousel.execute()); //false
        System.out.println(carousel.isEmpty()); //true
    }
}
