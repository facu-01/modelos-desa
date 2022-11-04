package com.example.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entities.claseHijo_01;
import com.example.api.services.claseHijo_01ServiceImpl;

@RestController
@CrossOrigin(origins = \"*\")
@RequestMapping(path = "api/v1/clasehijo_01")
public class claseHijo_01Controller extends BaseControllerImpl<claseHijo_01, claseHijo_01ServiceImpl> {

}
