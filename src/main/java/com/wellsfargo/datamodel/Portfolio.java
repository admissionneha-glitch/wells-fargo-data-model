package com.wellsfargo.datamodel;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String portfolioName;

    private BigDecimal totalValue;

    public Portfolio() {}

    public Portfolio(String portfolioName, BigDecimal totalValue) {
        this.portfolioName = portfolioName;
        this.totalValue = totalValue;
    }

    public Long getId() { return id; }
    public String getPortfolioName() { return portfolioName; }
    public void setPortfolioName(String portfolioName) { this.portfolioName = portfolioName; }
    public BigDecimal getTotalValue() { return totalValue; }
    public void setTotalValue(BigDecimal totalValue) { this.totalValue = totalValue; }
}
