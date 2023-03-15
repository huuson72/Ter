package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
public static void main(String[] args) {
	String str = "21T1020659"; // Chuỗi cần kiểm tra 10 ky tu
	String regexString = "\\w{10}";
	boolean result = str.matches(regexString); 
	System.out.println(result);
	//Chuoi kiem tra ma khau co it nhat 6 ky tu
	String str1 = "abcdef"; 
	String str2 = "abc1355";
	boolean result1 = str1.matches("\\w{6,}"); 
	boolean result2 = str2.matches("\\w{6,}"); 
	System.out.println(result1);
	System.out.println(result2);
	//Chuoi kiem tra ma khau co it nhat 8 ky tu
	String str3 = "abcdefvc"; 
	boolean result3 = str3.matches("\\w{8,}"); 
	System.out.println(result3);
	//Kiem tra chuoi chua 1 ky tu hoa
	String str4 = "Abcdefg"; // Chuỗi cần kiểm tra
	boolean result4 = str4.matches(".*[A-Z].*"); // Kiểm tra chuỗi có ít nhất 1 ký tự in hoa
	System.out.println(result4); // In kết quả kiểm tra ra màn hình
	
	
}
}
