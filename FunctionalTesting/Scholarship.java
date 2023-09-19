public class Scholarship {
    public static String calScholar(int num_B, double gpa) {
        if(num_B < 0 || num_B >30) {
            return "Input khong hop le";
        } else
            if (num_B > 0) {
                return "Khong duoc xet hoc bong";
            } else {
                if (gpa < 0) {
                    return "Input khong hop le";
                } else if (gpa < 2.5) {
                    return "Khong duoc xet hoc bong";
                } else if (gpa < 3.2) {
                    return "Hoc bong loai Kha";
                } else if (gpa < 3.6) {
                    return "Hoc bong loai Gioi";
                } else if (gpa <= 4.0) {
                    return "Hoc bong loai Xuat sac";
                } else {
                    return "Input khong hop le";
            }
        }
    }
}
