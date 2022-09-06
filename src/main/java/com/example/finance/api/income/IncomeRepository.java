package com.example.finance.api.income;

import com.example.finance.api.common.repository.CommonQueryByUserExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends
        JpaRepository<Income, Long>,
        IncomeQueryRepository,
        JpaSpecificationExecutor<Income>,
        CommonQueryByUserExecutor<Income> {

}