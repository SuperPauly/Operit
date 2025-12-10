package com.operit.app;

/**
 * Operit Java Project
 * Uses the standard Gradle project structure
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Welcome to the Operit Java project!");
        System.out.println("=".repeat(50));
        System.out.println("This is a standard Gradle Java project where you can:");
        System.out.println("  ✨ Write and compile Java code");
        System.out.println("  📦 Manage dependencies with Gradle");
        System.out.println("  🏗️ Build and run Java applications");
        System.out.println("  🧪 Write and run unit tests");
        System.out.println("=".repeat(50));
        
        // 示例代码
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        System.out.println("\nCalculation example: 5 + 3 = " + result);
        
        // 数组处理示例
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = calc.sum(numbers);
        System.out.println("Array sum: " + sum + "\n");
        
        System.out.println("✅ Programme ran successfully!");
    }
}
