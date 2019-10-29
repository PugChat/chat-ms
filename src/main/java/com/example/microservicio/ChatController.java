package com.example.microservicio;

import com.example.microservicio.models.ChatModel;
import com.example.microservicio.repositories.ChatRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class ChatController {
    @Autowired
    private ChatRepository repository;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ChatModel> getAllChats() {
        return repository.findAll();
    }
    /*
    @RequestMapping(value = "/{emisor}/{receptor}", method = RequestMethod.GET)
    public List<ChatModel> getChatByEmiRec(@PathVariable int emisor, @PathVariable int receptor) {
        return repository.findByEmisorAndReceptor(emisor,receptor);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody ChatModel chatModel) {
        chatModel.set_id(id);
        repository.save(chatModel);
    }*/

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ChatModel createChatREG(@Valid @RequestBody ChatModel chatModel) {
        chatModel.set_id(ObjectId.get());
        repository.save(chatModel);
        return chatModel;
    }

    /*@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePet(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }*/
}
