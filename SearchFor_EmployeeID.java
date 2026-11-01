public class SearchFor_EmployeeID {
    public static void main(String[] args) {
       int ValidEmployeeId=35233;
       int array[]={1000,3523,4444,35233,5000};
       for (int i : array) {
          if(ValidEmployeeId==i){
            System.out.println("Valid EmployeeID found");
            break;
          }
          System.out.println("Not Valid EmployeeID found-Skip");
          continue;
       }
    }
    
}
