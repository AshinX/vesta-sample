package com.fengyue.vesta.controller;

import com.robert.vesta.service.bean.Id;
import com.robert.vesta.service.intf.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IdService idService;

    @GetMapping(value = "getId")
    public Long getId(){
        return idService.genId();
    }

    @GetMapping(value = "expid")
    public Id expid(@RequestParam(name = "id") Long id){
        return idService.expId(id);
    }

    @GetMapping(value = "makeid")
    public long makeid(@RequestParam(name = "genMethod") Long genMethod,
        @RequestParam(name = "machine") Long machine,
        @RequestParam(name = "seq") Long seq,
        @RequestParam(name = "time") Long time,
        @RequestParam(name = "type") Long type,
        @RequestParam(name = "version") Long version
    ){
        //genMethod=?&machine=?&seq=?&time=?&type=?&version=?
        return idService.makeId(genMethod,machine,seq,time,type,version);
    }



}
