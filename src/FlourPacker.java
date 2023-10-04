public class FlourPacker {
    public FlourPacker() {
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (bigCount * 5 + smallCount < goal) {
                return false;
            } else {
                return goal % 5 <= smallCount;
            }
        } else {
            return false;
        }
    }
}
