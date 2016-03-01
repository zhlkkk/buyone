package com.buyone.account.controllers;

import com.buyone.account.common.PathConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kkk on 16/3/1.
 */
@Controller
public class IndexController extends BaseAccountController {

    @RequestMapping(value = PathConstants.request_demo, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("str", "kkk");
        return "index";
    }
}
