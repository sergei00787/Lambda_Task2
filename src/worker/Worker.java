package worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void startWork(){
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError(i, new RuntimeException("RuntimeException"));
                continue;
            }
            callback.onDone("Taks " + i + " is Done");
        }
    }

}
