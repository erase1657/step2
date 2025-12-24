import java.io.*;

public class project {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        System.out.println("=== 입력 테스트 ===");
        while(true){
            System.out.print("입력 (종료: quit) > ");
            String s = br.readLine();
            
            if(s.equals("quit")) {
                System.out.println("프로그램을 종료합니다.");
                br.close();
                break;
            }
            System.out.println("입력한 값: " + s);
            //테스트 추가
        }
    }
}
