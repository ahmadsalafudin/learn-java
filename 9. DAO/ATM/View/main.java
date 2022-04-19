/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ATM.View;

import java.sql.SQLException;

/**
 *
 * @author dedem
 */
public class main {
    public static void main(String[] args) throws SQLException {
        boolean run = true;
        do {            
            nasabahView ns = new nasabahView();
            ns.login();
        } while (run);
    }
}
