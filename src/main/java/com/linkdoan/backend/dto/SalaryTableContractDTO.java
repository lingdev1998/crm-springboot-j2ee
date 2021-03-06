package com.linkdoan.backend.dto;

import com.linkdoan.backend.model.SalaryTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryTableContractDTO {

    Long id;

    private Long salaryTableId;

    private Long contractId;

    private ContractDTO contractDTO;

    private Double basicSalary;

    private Double willPaymentSalary;

    private String description;

    private SalaryTable salaryTable;

    private Integer status;

    public SalaryTableContractDTO(Long id, Long salaryTableId, Long contractId, Double basicSalary, Double willPaymentSalary, String description,Integer status) {
        this.id = id;
        this.salaryTableId = salaryTableId;
        this.contractId = contractId;
        this.basicSalary = basicSalary;
        this.willPaymentSalary = willPaymentSalary;
        this.description = description;
        this.status = status;
    }

    public SalaryTableContractDTO(Long id, Long salaryTableId, Long contractId, Double basicSalary, Double willPaymentSalary, String description, SalaryTable ST, Integer status) {
        this.id = id;
        this.salaryTableId = salaryTableId;
        this.contractId = contractId;
        this.basicSalary = basicSalary;
        this.willPaymentSalary = willPaymentSalary;
        this.description = description;
        this.salaryTable = ST;
        this.status = status;
    }
}
