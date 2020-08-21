package nowcoder;

import java.util.Scanner;

/**
 * 分组背包
 * 问题描述
 * 有若干件物品，取一个物品需要付出的代价是weight[ i ]，价值为value[ i ]。
 * 物品被分为 k 组，每组只能选取一个物品。现有一个容量为W的背包，问如何选取物品放入背包，使得背包内物品的总价值最大。
 *
 *
 * 1，第一行给出两个整数 k 和 W 用空格分开分别代表物品组数和背包容量
 * 2，随后给出 k 组数据
 * 每组第一行整数 temp 表示该组有多少个物品
 * 后面 temp 行表示物品重量和价值
 */
public class BackPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();//共有多少组数
        int W = sc.nextInt();//背包容量
        int[] weight = new int[1024];
        int[] value = new int[1024];
        int[] sum = new int[1024];
        //k组
        for (int i = 0; i < k; i++) {
            int temp = sc.nextInt();//每组有多少物品

            for (int j = 0; j < temp; j++) {
                weight[j] = sc.nextInt();//第i组第j个物品的重量
                value[j] = sc.nextInt();//第i组第j个物品的价值
            }
            //花费代价
            for (int j = W; j >= 0; j--) {
                //每组物品的每个物品
                for (int l = 0; l < temp; l++) {
                    //保证物品重量小于背包容量
                    if (j >= weight[l]) {
                        //表示前i组花费j代价的最大收益
                        sum[j] = Math.max(sum[j], sum[j - weight[l]] + value[l]);
                    }
                }
            }
        }
        System.out.println(sum[W]);
    }
}