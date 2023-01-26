package service.inter;

public interface Process {
     void processLogic();

     default void process(){
         processLogic();
     }
}
