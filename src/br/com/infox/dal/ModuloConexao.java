/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author EmilyOliveiraXavier
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer a conexao com o banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver que importei para blibliotecas
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações ref. ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "45462130a";
        // Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // a linha de baixo serve de apoio para esclarecer o erro de conexao 
            //System.out.println(e);
            return null;
        }
    }
}
