package com.example.eon.crm.entity;

import com.example.eon.crm.enums.BillingMonth;
import com.example.eon.crm.enums.BillingType;
import com.example.eon.crm.enums.InvoiceStyle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "billing")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billing_id")
    private Long billingId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "billing_time")
    private Date billingTime;
    @Enumerated(EnumType.STRING)
    @Column(name = "billing_month")
    private BillingMonth billingMonth;  // Enum for billing months
    @Enumerated(EnumType.STRING)
    @Column(name = "invoice_style_name")
    private InvoiceStyle invoiceStyleName;  // Enum for invoice styles
    @ManyToOne
    @JoinColumn(name = "package_id")
    private Package packageDetails;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "duration")
    private Double duration;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private BillingType type;  // Enum for billing types
    @Temporal(TemporalType.DATE)
    @Column(name = "subscription_start_date")
    private Date subscriptionStartDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "subscription_end_date")
    private Date subscriptionEndDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "last_billing_date")
    private Date lastBillingDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "next_billing_date")
    private Date nextBillingDate;
    @Column(name = "renewal")
    private Boolean renewal;
    @Column(name = "tax")
    private Integer tax;
    @Column(name = "tax_amount")
    private Double taxAmount;
}
