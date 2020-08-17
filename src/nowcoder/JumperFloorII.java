package nowcoder;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumperFloorII {
    public int JumpFloorII(int target) {
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        return (int) Math.pow(2, target - 1);
    }
    //最简单的解法
    public int ju(int target) {
        return 1 << (target - 1);
    }
}
