public class FileProcessor {
 public static void processFile(String filename) throws IOException {
 BufferedReader reader = new BufferedReader(new 
FileReader(filename));
 String line;
 while ((line = reader.readLine()) != null) {
 System.out.println(line);
 }
 reader.close();
 }
 public static void main(String[] args) {
 System.out.println("Priyadharshini M (2024503501) || WEEK8 
Program 3 ");
 try {
 processFile("test.txt");
 } catch (IOException e) {
 System.out.println("File error: " + e.getMessage());
 }
 }
}
