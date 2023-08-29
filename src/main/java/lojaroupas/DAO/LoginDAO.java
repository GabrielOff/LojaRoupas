/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaroupas.DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author OffSys
 */
public class LoginDAO {

    public static boolean login(String usuario, String senha) {
        String usuarioPadrao = "GabrielAraujo";
        String senhaPadrao = "Lojaroupa";
        boolean sucesso = false;
        
        if (usuario.equalsIgnoreCase(usuarioPadrao) && senha.equalsIgnoreCase(senhaPadrao)) {
            sucesso = true;
        } else {
            JOptionPane.showMessageDialog(null, "Senha Incorreta", "title", JOptionPane.ERROR_MESSAGE);
        }
        
        return sucesso;
    }
}

