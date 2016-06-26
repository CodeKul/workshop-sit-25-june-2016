/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.sit;

import com.codekul.sit.domain.Login;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aniruddha
 */

@RestController
public class LoginController {
    
    @RequestMapping(method = RequestMethod.POST,
            value = "/login", 
            produces = MediaType.APPLICATION_JSON_VALUE, 
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String,String>> login(@RequestBody Login login){
    
        ResponseEntity<Map<String,String>> entity = null;
        
        if(login.getUserName().equals("codekul")
                && login.getPassword().equals("melayer")){
            Map<String,String> map= new HashMap<>();
            map.put("status","success");
            
            entity = new ResponseEntity<>(map,HttpStatus.OK);
        }
        else {
            Map<String,String> map= new HashMap<>();
            map.put("status","fail");
            HttpHeaders header = new HttpHeaders();
            entity = new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
        }
        return entity;
    }
}
