package com.xworkz.calenderapp.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "calender_servlet")
public class EventDto {

    @Column(name = "id")
    @Id
    @GenericGenerator(name = "raksha" , strategy = "increment")
    @GeneratedValue(generator = "raksha")
    private int id;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "reason_for_event")
    private String reasonForEvent;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "all_day_event")
    private String allDayEvent;

    @Column(name = "description")
    private String description;
}
