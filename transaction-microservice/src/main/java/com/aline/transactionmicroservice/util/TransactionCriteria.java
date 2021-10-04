package com.aline.transactionmicroservice.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionCriteria {
    private String searchTerm;
    private TransactionCriteriaMode mode;
}
