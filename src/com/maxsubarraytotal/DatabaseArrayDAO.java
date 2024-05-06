package com.maxsubarraytotal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author mzm
 * @version 1.0
 */

public class DatabaseArrayDAO implements ArrayDAO {
    private String url;
    private String username;
    private String password;

    public DatabaseArrayDAO(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public int[] readArray() {
        int[] nums = null;
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT array_data FROM arrays");
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                String[] numbers = rs.getString("array_data").split(",");
                nums = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    nums[i] = Integer.parseInt(numbers[i]);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nums;
    }

    @Override
    public void writeArray(int[] nums) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO arrays(array_data) VALUES(?)")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                sb.append(nums[i]);
                if (i < nums.length - 1) {
                    sb.append(",");
                }
            }
            stmt.setString(1, sb.toString());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
