import test.beans.UsersList;
import test.entity.UsersEntity;


public class Main {
    public static void main(String[] args) {

        UsersList userList = new UsersList();

        for (UsersEntity usersEntity : userList.getUsers()) {
            System.out.println(usersEntity.getUserName());
        }
    }
}