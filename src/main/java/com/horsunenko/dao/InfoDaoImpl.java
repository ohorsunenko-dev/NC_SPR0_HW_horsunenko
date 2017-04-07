package com.horsunenko.dao;

import com.horsunenko.model.Info;
import com.horsunenko.dao.InfoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;


public class InfoDaoImpl implements InfoDao{

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertInfo(Info info){

        String sql = "INSERT INTO INFO (ID, LASTNAME, FIRSTNAME, COMMENT) VALUES (?, ?, ?, ?)";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, info.getId());
            ps.setString(2, info.getLastName());
            ps.setString(3, info.getFirstName());
            ps.setString(4, info.getComment());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }

    public Info getById(int id) {

        String sql = "SELECT * FROM INFO WHERE ID = ?";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            Info info = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                info = new Info();
                rs.getInt("ID");
                rs.getString("LASTNAME");
                rs.getString("FIRSTNAME");
                rs.getString("COMMENT");
            }
            rs.close();
            ps.close();
            return info;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
