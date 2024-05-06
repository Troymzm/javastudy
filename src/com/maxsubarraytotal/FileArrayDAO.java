package com.maxsubarraytotal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class FileArrayDAO implements ArrayDAO{
    private String filePath;

    public FileArrayDAO(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public int[] readArray() {
        int[] nums = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            String[] numbers = line.split(",");
            nums = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                nums[i] = Integer.parseInt(numbers[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nums;
    }

    @Override
    public void writeArray(int[] nums) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < nums.length; i++) {
                writer.write(Integer.toString(nums[i]));
                if (i < nums.length - 1) {
                    writer.write(",");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
