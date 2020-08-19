package second;

import second.interfaces.NotRemembringPerson.NotRememberingMain;

public class Main {

    public static void main(String[] args) {

        int countUsers = 8;

        NotRememberingMain cham = new NotRememberingMain(countUsers);
        Championship championship = new Championship(cham);

        championship.toRememberAndGetWinner();

    }
}
