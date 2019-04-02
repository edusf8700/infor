/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infor.dal;

import java.sql.*;

/**
 *
 * @author Eduardo
 */
public class ModuloConexao {

    //Método responsável por estabelecer conexão com o banco de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a lnha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando imformações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinforx";
        String user = "root";
        String password = "";
        //Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;        
        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}
