package OOP_Bai10;

public class VanBan {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    private String s;

    public VanBan() {

    }

    public VanBan(String s) {
        this.s = s;

    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "VanBan{" +
                "s='" + s + '\'' +
                '}';
    }

    /**
     * Đếm số từ của một chuỗi,
     * giả sử các từ được ngăn cách nhau bởi một hoặc nhiều
     * dấu 'space', tab '\t' và xuống dòng '\n'
     *
     * @param input - chuỗi ký tự
     * @return số từ của chuỗi ký tự input
     */
    public int countWords(String input) {
        if (s == null) {
            return -1;
        }
        int count = 0;
        int size = s.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != SPACE && s.charAt(i) != TAB && s.charAt(i) != BREAK_LINE) {
                if (notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

    public int countcharA(String input) {
        int size = s.length();
        int count = 0;
        for(int i = 0; i<size ;i++) {
            if(s.charAt(i)=='A' || s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
    public String chuanhoachuoi(String input) {
        //xóa bo khoang trắng hai day
        s = s.trim();
        //xóa bỏ khoảng trăng liền kề nhau ở giữa
        s = s.replaceAll("\\s+", " ");
        return s;
    }


}
