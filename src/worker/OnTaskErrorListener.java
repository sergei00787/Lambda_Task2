package worker;

import java.io.IOException;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(int taskNumber, Exception error);
}
