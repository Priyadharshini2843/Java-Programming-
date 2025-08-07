public class StaticNested {
        static String bankName = "Smart Bank";
    //Public static nested class
    public static class PublicService {
        public void showService() {
            System.out.println("Welcome to " + bankName);
            System.out.println("Public Service: Apply for Loan");
        }
    }
    //Private static nested class
    private static class AuditService {
        public void performAudit() {
            System.out.println("Private Audit: Auditing transactions of " + bankName);
        }
    }
    public static void accessAudit() {
        AuditService audit = new AuditService();
        audit.performAudit();
    }

    public static void main(String[] args) {
        System.out.println(" PRIYADHARSHINI . M (2024503501) || Week4 Program 8 ");
        PublicService publicService = new PublicService();
        publicService.showService();
        accessAudit();
}
}
