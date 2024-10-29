package org.xworkz.com;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieDto {
    private int id;
    private String movieName;
    private  double ratings;
}
