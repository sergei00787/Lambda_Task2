package worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = (taskNumber, exeption) -> {
            System.out.println("Ошибка в задании - " + taskNumber +" - " + exeption.getMessage());
        };

        Worker worker = new Worker(listener, errorListener);
        worker.startWork();
    }


}
