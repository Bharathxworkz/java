package org.xworkz.jdbc;

import lombok.*;

@Getter
@Setter
@ToString@AllArgsConstructor
@NoArgsConstructor

public class BillDto {

    private int id;
    private String issueDate;
    private String dueDate;
    private double amount;

}
