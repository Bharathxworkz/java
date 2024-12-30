package com.xworkz.books.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Bookdto")
@NamedQueries({
@NamedQuery(name = "getAllDetails",query = "select user from Bookdto user"),
@NamedQuery(name = "DeleteUserById",query = "delete from Bookdto dto where dto.id =: id"),
@NamedQuery(name = "getNameByAuthor",query = "select user.bookName from Bookdto user where user.authorname =: author"),
@NamedQuery(name = "getNameByYear",query = "select user.bookName from Bookdto user where user.publishingYear =: year"),
@NamedQuery(name = "getNameAuthorByYear",query = "select user.bookName, user.authorname from Bookdto user where user.publishingYear =: year"),
@NamedQuery(name = "updateNameByYear",query = "update Bookdto dto set dto.bookName =: name where dto.publishingYear =: year"),
@NamedQuery(name = "deleteBookByName",query = "delete Bookdto dto where dto.bookName =: name")
})
public class Bookdto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author_name")
    private String authorname;
    @Column(name = "publish_year")
    private int publishingYear;
}
