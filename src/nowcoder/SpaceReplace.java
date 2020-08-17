package nowcoder;

/**
 * 替换空格
 * <p>
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class SpaceReplace {
    public static String replaceSpace(StringBuffer str) {
        if (str == null)
            return null;
        char[] chars = str.toString().toCharArray();
        String addString = "%20";
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' ')
                stringBuilder.append(addString);
            else
                stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append(" We");
        System.out.println(replaceSpace(str));
    }

}
