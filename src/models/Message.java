package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@NamedQueries({
    @NamedQuery(
        name = "getAllMessages",
        query = "SELECT m FROM Message AS m ORDER BY m.id DESC"
        ),
    @NamedQuery(
            name= "getMessagesCount",
            query= "SELECT COUNT(m) FROM Message AS m"
            )
})

@Table(name = "messages")

public class Message {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "content", length = 255, nullable = false)
    private String content;

    @Column(name = "create_at", nullable = false)
    private Timestamp create_at;

    @Column(name = "update_at", nullable = false)
    private Timestamp update_at;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getUpdated_at() {
        return update_at;
    }

    public void getUpdated_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public Timestamp getCreated_at() {
        return create_at;
    }

    public void setCreated_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public void setUpdated_at(Timestamp update_at) {
        this.update_at=update_at;
    }

}
