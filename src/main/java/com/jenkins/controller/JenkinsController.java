package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/api/v1")
public class JenkinsController
{
    @GetMapping(value = "/jenkins")
    public HashMap<String, String> jenkins()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello Jenkins");
        return map;
    }
}
