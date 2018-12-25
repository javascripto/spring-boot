package com.yuri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	// http://localhost:8080/hello/world
	@GetMapping(path = "/world")
	@ResponseBody
	public String world() {
		return "<h1>Olá, Mundo!</h1>";
	}

	// http://localhost:8080/hello/world/yuri
	@GetMapping(path = "/world/{name}")
	@ResponseBody
	public String hello(@PathVariable String name) {
		return "<h1>Olá, Mundo! E ai " + name + ", blz?</h1>";
	}
	
	// Using FormData with POST method
	// POST http://localhost:8080/hello/world name=Fulano
	@PostMapping(path = "/world")
	@ResponseBody
	public String sayPost(@RequestParam String name) {
		return "Este é o meu resultado: " + name;
	}
}
