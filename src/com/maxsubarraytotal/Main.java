package com.maxsubarraytotal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author mzm
 * @version 1.0
 */
public class Main {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "aaron33120";
    public static void main(String[] args) {
        // 初始化数据访问对象
        ArrayDAO fileDAO = new FileArrayDAO("E:\\code\\ideaJava\\javastudy_git\\src\\com\\maxsubarraytotal\\array.txt");
        ArrayDAO databaseDAO = new DatabaseArrayDAO("jdbc:mysql://localhost:3306/maxsubarray", USER, PASS);

        // 从文件或数据库读取数组数据
        int[] numsFromFile = fileDAO.readArray();
        int[] numsFromDatabase = databaseDAO.readArray();

        // 创建 ArrayProcessor 对象
        ArrayProcessor bruteForceProcessor = new BruteForceArrayProcessor();
        ArrayProcessor optimizedProcessor = new OptimizedArrayProcessor();

        // 使用多态调用算法
        int maxSum1 = bruteForceProcessor.maxSubArraySum(numsFromFile);
        int maxSum2 = optimizedProcessor.maxSubArraySum(numsFromDatabase);

        // 将结果输出到文件或数据库
        writeResultToFile("E:\\code\\ideaJava\\javastudy_git\\src\\com\\maxsubarraytotal\\results.txt", maxSum1, maxSum2);
        writeResultToDatabase(maxSum1, maxSum2);

        // 关闭文件或数据库连接
    }
    private static void writeResultToFile(String filePath, int maxSum1, int maxSum2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Max sum from file: " + maxSum1);
            writer.newLine();
            writer.write("Max sum from database: " + maxSum2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeResultToDatabase(int maxSum1, int maxSum2) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/maxsubarray", USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO result_table(max_sum_file, max_sum_database) VALUES(?, ?)")) {
            stmt.setInt(1, maxSum1);
            stmt.setInt(2, maxSum2);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
