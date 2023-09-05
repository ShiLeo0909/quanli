package oop9.EX2_1;

public class Library {
    private static Rent [] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }
    public static Rent getLongrstRent(){
        Rent longestRent = null;
        long longestDuration = 0;

        for (Rent rent : rents) {
            // Tính độ dài của mỗi đối tượng Rent
            long duration = rent.getEnd().getTime() - rent.getBegin().getTime();

            // So sánh với độ dài thuê lâu nhất hiện tại
            if (duration > longestDuration) {
                longestDuration = duration;
                longestRent = rent;
            }
        }

        return longestRent;
    }
}
