package org.emela.sushi.controller;

import lombok.extern.slf4j.Slf4j;
import org.emela.sushi.api.ItemsApi;
import org.emela.sushi.model.Item;
import org.emela.sushi.model.ItemDetailResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
public class ItemController implements ItemsApi {


    @Override
    public ResponseEntity<ItemDetailResponse> retrieveItem() {
        ItemDetailResponse response = new ItemDetailResponse().item(new Item().name("Sush")).itemId("123");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
