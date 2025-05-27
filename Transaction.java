@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private int customerId;
    private BigDecimal transactionAmount;
    private Timestamp transactionDate;
    private String location;
    private String status;

    // Getters and setters
}