package BancoDeDados.Application;

import BancoDeDados.db.DB;

import java.sql.Connection;

public class DbTest {
    static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
