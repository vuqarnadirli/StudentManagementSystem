package service.inter;

import bean.Config;

public interface SaveableProcess extends Process {
    default void process() {
        processLogic();
        Config.save();
    }
}
