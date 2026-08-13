package com.example.adhar;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class adharService {

    List<adhar> findAllAdharDetials(){
    	
       ArrayList<adhar> list = new ArrayList<>();
       list.add(new adhar(1231, "thejas", 26, "suadgaindadadn ajdvajcv"));
       list.add(new adhar(1134, "twhjscb", 66, "jvjhb sjhbvs schjdsv"));
       return list;
    }
    	

}
