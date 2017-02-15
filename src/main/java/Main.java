import test.beans.UsersList;
import test.entity.UsersEntity;


public class Main {
    //нужен для быстрых тестов
    public static void main(String[] args) {

        UsersList userList = new UsersList();

        for (UsersEntity usersEntity : userList.getUsersList()) {
            System.out.println(usersEntity.getUserName());
        }
    }
}