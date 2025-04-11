package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
//        Util.getConnection();
        UserDao service = new UserDaoHibernateImpl();
        service.createUsersTable();
        service.saveUser("Ivan", "Ivanov", (byte) 26);
        service.saveUser("Petr", "Petrov", (byte) 40);
        service.saveUser("Anton", "Antonov", (byte) 19);
        service.saveUser("Olga", "Olgina", (byte) 31);
        service.getAllUsers();
        service.cleanUsersTable();
//        service.removeUserById(3);
        service.dropUsersTable();

    }
}
