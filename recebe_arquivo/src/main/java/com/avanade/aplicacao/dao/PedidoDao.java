package com.avanade.aplicacao.dao;

import com.avanade.aplicacao.model.PedidoModel;

import java.sql.*;
import java.util.Optional;
import java.util.Properties;

public class PedidoDao {
    private Connection connection;

    public PedidoDao(Connection connection) throws SQLException {
        connection = criarConexao();
    }

    private Connection criarConexao() throws SQLException {
        String url = "jdbc:postgresql://localhost/test";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","example");
        props.setProperty("ssl","true");
        return DriverManager.getConnection(url, props);
    }

    public PedidoModel inserir(PedidoModel pedido){
        return pedido;
    }

    public PedidoModel atualizar(PedidoModel pedido){
        return pedido;
    }

    public Optional<PedidoModel> buscaPorCodigo(Integer codigo) throws SQLException {

        StringBuilder sb = new StringBuilder();
        sb.append("select *");
        sb.append( " from pedidos");
        sb.append("where codigo = " + codigo);

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sb.toString());

        if (!rs.next()){
            return Optional.empty();
        }

        return null;
    }

}
