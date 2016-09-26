package com.tiy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jfabiano on 9/22/2016.
 */
@Controller
public class ChocolateController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String login(Model model, HttpSession session) throws Exception{//notice NOT an integer(int), but an Integer so it can be null rather than 0 initially. Using the Boxed type vs the primitive type

//        if (session.getAttribute("user") != null) {
//            model.addAttribute("user", session.getAttribute("user"));
//        }
//
//        List<Todo> todoList = new ArrayList<Todo>();
//
//        User savedUser = (User)session.getAttribute("user");
//        if (savedUser != null) {
//            todoList = todos.findByUser(savedUser);
//        } else {
//            Iterable<Todo> allTodos = todos.findAll();
//            for (Todo todo : allTodos) {
//                todoList.add(todo);
//            }
//        }
//        model.addAttribute("todos", todoList);
        return "home";
    }

}
