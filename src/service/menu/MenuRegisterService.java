package service.menu;

import service.inter.menu.MenuRegisterServiceInter;
import service.inter.SaveableProcess;

public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void processLogic() {
        System.out.println("register");
    }
}
