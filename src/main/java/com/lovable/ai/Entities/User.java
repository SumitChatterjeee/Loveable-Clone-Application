package com.lovable.ai.Entities;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.time.Instant;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class User {
    Integer id;
    String email;
    String passwordhash;
    String name;
    String avatarurl;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
