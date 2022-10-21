package com.example.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entities.Base;
import com.example.api.services.BaseServiceImpl;

@RestController
@CrossOrigin(origins = \"*\")
@RequestMapping(path = "api/v1/base")
public class BaseController extends BaseControllerImpl<Base, BaseServiceImpl> {

}
