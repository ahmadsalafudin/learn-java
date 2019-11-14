/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.dao.view;

import java.sql.SQLException;

/**
 *
 * @author ahmad
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        boolean run = true;
        do {
            ViewMahasiswa vm = new ViewMahasiswa();
            vm.showMenu();
        } while (run);
        
    }
}
