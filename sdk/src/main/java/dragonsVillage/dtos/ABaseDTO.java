package dragonsVillage.dtos;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public abstract class ABaseDTO{
    private BlockingQueue userMutex = new ArrayBlockingQueue(1);
    private Object unlockObject = new Object();

    {
        try {
            userMutex.put(unlockObject);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public BlockingQueue getUserMutex() {
        if(userMutex == null) {
            userMutex = new ArrayBlockingQueue(1);
        }
        return userMutex;
    }

    public void setUserMutex(BlockingQueue userMutex) {
        this.userMutex = userMutex;
    }

    public Object getUnlockObject() {
        return unlockObject;
    }

    public void setUnlockObject(Object unlockObject) {
        this.unlockObject = unlockObject;
    }
}
