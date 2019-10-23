package com.example.microservicio.repositories;

import com.example.microservicio.models.ChatModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatRepository extends MongoRepository<ChatModel, String> {
    ChatModel findBy_id(ObjectId _id);
    //@Repository
    List findByEmisorAndReceptor(int emisor, int receptor);
}
